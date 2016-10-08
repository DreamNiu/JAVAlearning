package BiShi;
//去哪儿网笔试，utf8编码转换为Unicode编码

import java.util.ArrayList;
import java.util.Scanner;

public class MainQunar1 {
	public static void main(String[] args) {
		// System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);

		// byte[] utfByte = null;
		ArrayList<Byte> utfByte = new ArrayList<Byte>();
		for (int i = 0; i < utfByte.size(); i++) {
			// utfByte[i]=scanner.nextByte();
			byte temp = scanner.nextByte();
			utfByte.add(temp);
		}

		Object[] utfByteArray = utfByte.toArray();
		for (int i = 0; i < utfByteArray.length; i++) {
			System.out.println(utfByteArray[i]);
		}

	}

	// 将输入的Utf8编码数据转为Unicode数据
	public static String Utf8ToUnicode(byte[] aByte) {
		StringBuffer sUnicodeString = new StringBuffer();
		int sLength = aByte.length;
		int sInt_1, sInt_2, sInt_3, sInt_4, sInt_5, sInt_6;
		for (int i = 0; i < sLength; i++) {
			sInt_1 = (int) aByte[i] & 0xff;
			switch (sInt_1 >> 4) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				sUnicodeString.append((char) aByte[i]);
				break;
			case 12:
			case 13:
				if (i + 1 < sLength) {
					sInt_2 = (char) aByte[i + 1];
					if ((sInt_2 & 0xC0) == 0x80) {
						sUnicodeString.append((char) (((sInt_1 & 0x1F) << 6) | (sInt_2 & 0x3F)));
						i++;
					}
				}
				break;
			case 14:
				if (i + 2 < sLength) {
					sInt_2 = (int) aByte[i + 1];
					sInt_3 = (int) aByte[i + 2];
					if (((sInt_2 & 0xC0) == 0x80) || ((sInt_3 & 0xC0) == 0x80)) {
						sUnicodeString.append(
								(char) (((sInt_1 & 0x0F) << 12) | ((sInt_2 & 0x3F) << 6) | ((sInt_3 & 0x3F) << 0)));
						i = i + 2;
					}
				}
				break;
			}
		}
		return sUnicodeString.toString();
	}
}
