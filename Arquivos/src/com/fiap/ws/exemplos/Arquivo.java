package com.fiap.ws.exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Arquivo {

	@WebMethod
	public void upload(String nome, byte[] imageBytes){
		String filePath = "C:/Temp/Upload/" + nome;
		
		try ( FileOutputStream fos = new FileOutputStream(filePath);
			  BufferedOutputStream outputStream = new BufferedOutputStream(fos);){
			
			outputStream.write(imageBytes);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@WebMethod
	public byte[] download(String fileName){
		String filePath = "C:/Temp/Download/" + fileName;
		
		File file = new File(filePath);
		byte[] fileBytes = new byte[]{};
		
		try ( FileInputStream fis = new FileInputStream(file);
			  BufferedInputStream inputStream = new BufferedInputStream(fis);){
			
			fileBytes = new byte[(int)file.length()];
			inputStream.read(fileBytes);
			
			return fileBytes;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileBytes;
	}
}
