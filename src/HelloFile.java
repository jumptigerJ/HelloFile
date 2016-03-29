import java.io.File;
import java.io.IOException;

public class HelloFile {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		//是否存在
		if(file.exists()){
			//文降价结构必须处于同一分区
			File nameTo = new File("src/new Hello.txt");
			file.renameTo(nameTo);
			//判断是不是文件
//			System.out.println(file.isFile());
			//判断是不是路径
//			System.out.println(file.isDirectory());
//			file.delete();
//			System.out.println("文件已被删除");
		}else{
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件已被创建");
			} catch (IOException e) {
				System.out.println("文件无法被创建");
				e.printStackTrace();
			}
		}
	}
}
