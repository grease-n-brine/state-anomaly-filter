package saf.cipher.morse;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public enum MorseSymbol {
        DOT,
        DASH
    }

    public static final String DOT = ".";
    public static final String DASH = "-";

    private static final Map<MorseSymbol[], Character> DECODE_MAP = new HashMap<>();
    static {
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH}, 'A');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DOT}, 'B');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DOT}, 'C');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DOT}, 'D');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT}, 'E');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DOT}, 'F');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DOT}, 'G');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DOT}, 'H');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT}, 'I');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DASH}, 'J');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DASH}, 'K');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DOT}, 'L');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DASH}, 'M');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT}, 'N');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DASH}, 'O');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DOT}, 'P');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DASH}, 'Q');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DOT}, 'R');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DOT}, 'S');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH}, 'T');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DASH}, 'U');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DASH}, 'V');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.DASH,MorseSymbol.DASH}, 'W');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DOT, MorseSymbol.DASH}, 'X');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DASH, MorseSymbol.DASH}, 'Y');
        DECODE_MAP.put(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.DASH, MorseSymbol.DOT, MorseSymbol.DOT}, 'Z');
    }

    public static Character decode(MorseSymbol[] symbols) {
        return DECODE_MAP.getOrDefault(symbols, '?');
    }

    public static String returnDotString() {
        return DOT;
    }

    public static String returnDashString() {
        return DASH;
    }
}
