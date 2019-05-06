#!/bin/sh
java -cp antlr-3.5.2-complete.jar org.antlr.Tool Expr.g
javac -cp antlr-3.5.2-complete.jar:. testExpr.java
java -cp antlr-3.5.2-complete.jar:. testExpr input2.txt