// Generated from C:\Users\spacc\OneDrive\Desktop\LC2122-HIERRO-PIERO-APP3\Gedcom.g4 by ANTLR 4.10.1

package it.unicam.cs.lc2122.gedcom.target;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GedcomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GedcomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GedcomParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GedcomParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GedcomParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(GedcomParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#gedc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGedc(GedcomParser.GedcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#vers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVers(GedcomParser.VersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#charr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharr(GedcomParser.CharrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#datefile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatefile(GedcomParser.DatefileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(GedcomParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GedcomParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#lang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang(GedcomParser.LangContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(GedcomParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#individual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual(GedcomParser.IndividualContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFamily(GedcomParser.FamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#indi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndi(GedcomParser.IndiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GedcomParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#givn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivn(GedcomParser.GivnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#surn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurn(GedcomParser.SurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#sex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSex(GedcomParser.SexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#birt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBirt(GedcomParser.BirtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(GedcomParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#plac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlac(GedcomParser.PlacContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#deat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeat(GedcomParser.DeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#buri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuri(GedcomParser.BuriContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#famc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFamc(GedcomParser.FamcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#fams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFams(GedcomParser.FamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#fam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFam(GedcomParser.FamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#husb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHusb(GedcomParser.HusbContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#wife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWife(GedcomParser.WifeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#chil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChil(GedcomParser.ChilContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#marr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarr(GedcomParser.MarrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(GedcomParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GedcomParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#ance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnce(GedcomParser.AnceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GedcomParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(GedcomParser.DescContext ctx);
}