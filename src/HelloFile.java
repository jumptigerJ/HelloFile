import java.io.File;
import java.io.IOException;

public class HelloFile {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		//�Ƿ����
		if(file.exists()){
			//�Ľ��۽ṹ���봦��ͬһ����
			File nameTo = new File("src/new Hello.txt");
			file.renameTo(nameTo);
			//�ж��ǲ����ļ�
//			System.out.println(file.isFile());
			//�ж��ǲ���·��
//			System.out.println(file.isDirectory());
//			file.delete();
//			System.out.println("�ļ��ѱ�ɾ��");
		}else{
			System.out.println("�ļ�������");
			try {
				file.createNewFile();
				System.out.println("�ļ��ѱ�����");
			} catch (IOException e) {
				System.out.println("�ļ��޷�������");
				e.printStackTrace();
			}
		}
	}
}
