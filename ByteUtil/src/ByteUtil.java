
public class ByteUtil {
	
	private final static char[] hexArray =  {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	public static String byteToBase16(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
	    for (int i = 0; i < bytes.length; i++ ) {
	        int v = bytes[i] & 0xFF;
	        hexChars[i * 2] = hexArray[v >>> 4];
	        hexChars[i * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public static byte[] base16ToByteArray(String base16) {
		if (base16 == null || base16.length() % 2 != 0) {
			return null;
		}
	    int len = base16.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(base16.charAt(i), 16) << 4) + Character.digit(base16.charAt(i + 1), 16));
	    }
	    return data;
	}
}
