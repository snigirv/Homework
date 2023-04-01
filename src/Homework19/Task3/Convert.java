package Homework19.Task3;

import java.io.PrintStream;

public class Convert {
    public byte b;
    public short s;
    public int i;
    public long l;
    public char ch;
    public float f;
    public double d;
    public  String st;
    boolean bool;

    public Convert(int b, int s, int i, long l, char p, float f, double d, String st, boolean bool) {
        this.b = (byte) b;
        this.s = (short) s;
        this.i = i;
        this.l = l;
        this.ch = ch;
        this.f = f;
        this.d = d;
        this.st = st;
        this.bool = bool;
    }

    public int convertToInt (){
        return (int) b;
    }
    public int convertToInt (short s){
        return (int) s;
    }
    public int convertToInt (int i){
        return (int) i;
    }
    public int convertToInt (long l){
        return (int) l;
    }
    public int convertToInt (char ch){
        return (int) ch;
    }
    public int convertToInt (float f){
        return (int) f;
    }
    public int convertToInt (double d){
        return (int) d;
    }
    public int convertToInt (String st){
        return Integer.parseInt (st);
    }
    public String convertToInt (boolean bool) {
        String str;
        return str = "введен тип boolean";
    }

    public double convertToDouble (byte b){
        return (double) b;
    }
    public double convertToDouble (short s){
        return (double) s;
    }
    public double convertToDouble (int i){
        return (double) i;
    }
    public double convertToDouble (long l){
        return (double) l;
    }
    public double convertToDouble (char ch){
        return (double) ch;
    }
    public double convertToDouble (float f){
        return (double) f;
    }
    public double convertToDouble (double d){
        return d;
    }
    public double convertToDouble (String st){
        return Double.parseDouble (st);
    }
    public String convertToDouble (boolean bool) {
        String str;
        return str = "введен тип boolean";
    }


    public String converToString (byte b){
        return String.valueOf(b);
    }
    public String converToString (short s){
        return String.valueOf(s);
    }
    public String convertToString (int i){
        return Integer.toString(i);
    }
    public String converToString (long l){
        return Long.toString(l);
    }
    public String converToString (char ch){
        return String.valueOf(ch);
    }
    public String converToString (float f){
        return Float.toString(f);
    }
    public String converToString (double d){
        return Double.toString(d);
    }
    public String converToString (String st){
        return st;
    }
    public boolean converToString (boolean bool) {
        return bool;
    }

   /* public void getInform () {
        System.out.println(convertToInt(b));
        System.out.println(convertToInt(s));
        System.out.println(convertToInt(i));
        System.out.println(convertToInt(l));
        System.out.println(convertToInt(ch));
        System.out.println(convertToInt(f));
        System.out.println(convertToInt(d));
        System.out.println(convertToInt(st));

        System.out.println(convertToDouble(b));
        System.out.println(convertToDouble(s));
        System.out.println(convertToDouble(i));
        System.out.println(convertToDouble(l));
        System.out.println(convertToDouble(ch));
        System.out.println(convertToDouble(f));
        System.out.println(convertToDouble(d));
        System.out.println(convertToDouble(st));

        //System.out.println(converToString(b));
        System.out.println(converToString(s));
        System.out.println(converToString(i));
        System.out.println(converToString(l));
        System.out.println(converToString(ch));
        System.out.println(converToString(f));
        System.out.println(converToString(d));
        System.out.println(converToString(st));
        System.out.println(converToString(bool));
    } */

    public static void main(String[] args) {
        Convert in = new Convert (9, 22, 110, 4646464744546444645L, 'y', 0.2f, 5.69, "54", true);
        //in.getInform();

        System.out.println(in.convertToInt(in.b));
        System.out.println(in.convertToInt(in.s));
        System.out.println(in.convertToInt(in.l));
        System.out.println(in.convertToInt(in.ch));
        System.out.println(in.convertToInt(in.f));
        System.out.println(in.convertToInt(in.d));
        System.out.println(in.convertToInt(in.st));
        System.out.println(in.convertToInt(in.bool));

        System.out.println(in.convertToDouble(in.b));
        System.out.println(in.convertToDouble(in.s));
        System.out.println(in.convertToDouble(in.i));
        System.out.println(in.convertToDouble(in.l));
        System.out.println(in.convertToDouble(in.ch));
        System.out.println(in.convertToDouble(in.f));
        System.out.println(in.convertToDouble(in.d));
        System.out.println(in.convertToDouble(in.st));
        System.out.println(in.convertToDouble(in.bool));

        System.out.println(in.converToString(in.b));
        System.out.println(in.converToString(in.s));
        System.out.println(in.converToString(in.i));
        System.out.println(in.converToString(in.l));
        System.out.println(in.converToString(in.ch));
        System.out.println(in.converToString(in.f));
        System.out.println(in.converToString(in.d));
        System.out.println(in.converToString(in.st));
        System.out.println(in.converToString(in.bool));
    }
}

