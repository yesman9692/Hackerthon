import java.io.*;

public class SearchTxt { // Txt파일을 line별로 check하여 값이 있는지 확인

	static String menuTitle = "";

	public SearchTxt() {
	}

	public static boolean haveMenu(String checkFile, String checkLine) { // checkFile = 체크하고싶은 txt파일, checkLine = 알고싶은
																			// String라인

		BufferedReader br = null;
		String line; // 메뉴라인
		boolean check = false;
		int rowCount = 0; // 몇번째 있는 라인인지 check

		// 파일에 검색한 값이 있는지 없는지 확인
		try {
			br = new BufferedReader(new FileReader(checkFile)); // 매개변수 = 체크하고싶은 txt파일

			while ((line = br.readLine()) != null) {
				if (line.equals(checkLine)) { // 알고싶은 Line
					// System.out.println("찾은라인 : " + line);
					check = true;
					break;
				} else {
					// System.out.println("menu.txt 에 없습니다");
					check = false;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			System.out.println("파일 읽기오류");
		}

		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return check;

	}
	
	//public int whereRow(String )
}
