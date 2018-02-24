{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
\
public class theForgetfulMachine \{\
  public static void main(String[] args) \{\
    Scanner input = new Scanner(System.in);\
    \
    System.out.println("Give me a word!");\
    input.next();\
    System.out.println("Give me a second word!");\
    input.next();\
    \
    System.out.println("Great, now your favourite number?");\
    input.nextInt();\
    System.out.println("And your second-favourite number...");\
    input.nextInt();\
    \
    System.out.println("Whew! Wasn't that fun?");\
  \}\
\}}