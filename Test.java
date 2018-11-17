import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		int count = 0;

		FileReader fr = new FileReader("Menu.txt");
		BufferedReader br = new BufferedReader(fr);
		String readLine;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			count++;
		}

		System.out.println(count);

		SearchTxt mSearch = new SearchTxt();
		if (mSearch.haveMenu("Menu.txt", "순두부찌개")) { // "순부두찌개"가 menu.txt에 있음 > 메뉴추가 할 필요없음
			System.out.println("메뉴추가 불가");
		}

		else { // "순부두찌개"가 menu.txt에 없음 { "순부두찌개"가 menu.txt에 있음 > 메뉴추가 가능
			System.out.println("메뉴추가 가능");
		}
	}

}
