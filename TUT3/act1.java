package TUT3;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class act1 {
    public static void main(String[] args) {
        String progText = "class Hello { "
         + "public static void main(String[] args) { "
         + " System.out.println(\"Hello world!\"); "
         + "}}";

        CompilationUnit codeUnit = JavaParser.parse(progText);
        System.out.println(codeUnit);


    }
}
