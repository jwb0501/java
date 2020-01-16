package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.liebli.com/goods/goods_list.php?cateCd=001002");

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		int count = 0;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			int num = 0;
				while((num=line.indexOf("18k", num)) != -1) {
					num +=3;
					count++;
			}
		}
		System.out.println(count);

		// 18k ���� = 150 (18k, 18K ���)

	}

}
