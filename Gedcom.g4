grammar Gedcom;

@header{
package it.unicam.cs.lc2122.gedcom.target;
}

program : header record trailer command ;

// header
header : head ( gedc | charr | datefile | file | lang)* ;
head : ZERO WS HEAD NEWLINE ;
gedc : ONE WS GEDC NEWLINE vers? ;
vers : TWO WS VERS WS VERSION NEWLINE ; 
charr : ONE WS CHAR WS .*? NEWLINE vers?;
datefile : ONE WS DATE WS .*? NEWLINE time? ;
time : TWO WS TIME WS TIMEFORMAT NEWLINE ;
file : ONE WS FILE WS .*? NEWLINE ; 
lang : ONE WS LANG WS .*? NEWLINE ;

// record
record : ( individual | family )* ;
individual : indi ( name | sex | birt | deat | buri | famc | fams )* ;
family : fam ( husb | wife | chil | marr )* ;
indi : ZERO WS CODE WS INDI NEWLINE ;
name : ONE WS NAME WS .*? NEWLINE ( givn | surn )* ;
givn : TWO WS GIVN WS .*? NEWLINE ;
surn : TWO WS SURN WS .*? NEWLINE ;
sex : ONE WS SEX WS ( M | F ) NEWLINE ;
birt : ONE WS BIRT NEWLINE ( date | plac)* ;
date : TWO WS DATE WS .*? NEWLINE time? ;
plac : TWO WS PLAC WS .*? NEWLINE ;
deat : ONE WS DEAT NEWLINE ( date | plac )* ;
buri : ONE WS BURI NEWLINE ( date | plac )* ;
famc : ONE WS FAMC WS CODE NEWLINE ;
fams : ONE WS FAMS WS CODE NEWLINE ;
fam : ZERO WS CODE WS FAM NEWLINE;
husb : ONE WS HUSB WS CODE NEWLINE ;
wife : ONE WS WIFE WS CODE NEWLINE ;
chil : ONE WS CHIL WS CODE NEWLINE ;
marr :  ONE WS MARR NEWLINE ( date | plac )* ;

// trailer
trailer : ZERO WS TRLR NEWLINE  ;

// command
command : (  ance | desc ) ;
ance : ZERO WS ANCE WS CODE ;
desc : ZERO WS DESC WS CODE ;

// tokens
HEAD : 'HEAD' ;
GEDC : 'GEDC' ;
VERS : 'VERS' ;
CHAR : 'CHAR' ;
TIME : 'TIME' ;
FILE : 'FILE' ;
LANG : 'LANG' ;
INDI : 'INDI' ;
NAME : 'NAME' ;
GIVN : 'GIVN' ;
SURN : 'SURN' ;
SEX : 'SEX' ;
BIRT : 'BIRT' ;
DATE : 'DATE' ;
PLAC : 'PLAC' ;
DEAT : 'DEAT' ;
BURI : 'BURI' ;
FAMC : 'FAMC' ;
FAMS : 'FAMS' ;
FAM : 'FAM' ;
HUSB : 'HUSB' ;
WIFE : 'WIFE' ;
CHIL : 'CHIL' ;
MARR : 'MARR' ;
TRLR : 'TRLR' ;
ANCE : 'ANCE' ;
DESC : 'DESC' ;
ZERO : '0' ;
ONE : '1' ;
TWO : '2' ;
M : 'M' ;
F : 'F' ;
CODE : '@' [a-zA-Z0-9]+? '@' ;
TIMEFORMAT : /*HOUR*/('2'[0-3]|'1'[0-9]|[0-9]) ':' /*MINUTE*/[0-5][0-9]  /*SECOND*/(':'([0-5][0-9]))?;
VERSION : [0-9]+ '.' [0-9]+ '.' [0-9]+ ;
WS : [ \t]+ ;
NEWLINE : ('\r'? '\n')+ ;
STRING: .+? ;