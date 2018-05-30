package com.test.pdf;

import java.io.File;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class Word2Pdf {
	
	public static void main(String[] args) {
		
		ActiveXComponent app = null;
		String wordFile = "e:/玩一玩.doc";
		String pdfFile = "e:/玩一玩.pdf";
		System.out.println("---------------转换开始------------------");
		long start = System.currentTimeMillis();
		try {
			
		app = new ActiveXComponent("Word.Application");
		Dispatch documents = app.getProperty("Documents").toDispatch();
		System.out.println("打开文件: " + wordFile); 
		
		Dispatch document = Dispatch.call(documents, "Open", wordFile, false, true).toDispatch();
		File target = new File(pdfFile);  
        if (target.exists()) {  
           target.delete();
        }
		
        System.out.println("另存为: " + pdfFile);
        
        // 另存为，将文档保存为pdf，其中word保存为pdf的格式宏的值是17
        Dispatch.call(document, "SaveAs", pdfFile, 17);
        // 关闭文档
        Dispatch.call(document, "Close", false);
        // 结束时间
        long end = System.currentTimeMillis();
        System.out.println("转换成功，用时：" + (end - start) + "ms");
		}catch(Exception e) {
			
			System.out.println("转换失败！"+e.getMessage());
		}finally {
			
			app.invoke("Quit", 0);
		}
	}	
	
	
}
