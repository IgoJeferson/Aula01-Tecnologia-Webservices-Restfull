package br.com.fiap.teste;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.fiap.client.Arquivo;
import br.com.fiap.client.ArquivoService;

public class TesteUpload {

	public static void main(String[] args) {
		
		Arquivo port = new ArquivoService().getArquivoPort();
		
		File file = new File("C:/Temp/Download/ultra.jpg");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			byte[] imageBytes = new byte[(int)file.length()];
			bis.read(imageBytes);
			
			port.upload("ultra-miami.jpg", imageBytes);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
