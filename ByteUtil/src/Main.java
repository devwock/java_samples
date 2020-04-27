
public class Main {

	public static void main(String[] args) {
		byte[] bytes = ByteUtil.base16ToByteArray("1C4A2F");
		for(int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			System.out.println(String.format("0x%08X", b));
		}
		String strings = ByteUtil.byteToBase16(bytes);
		System.out.println(strings);
	}
}
