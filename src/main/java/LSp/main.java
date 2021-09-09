package LSp;

public class main {


        public void calculateArea(Rectangle r) {
            r.setBreadth(2);
            r.setLength(3);
              assert r.getArea() == 6 : printError("area", r);

            assert r.getLength() == 3 : printError("length", r);
            assert r.getBreadth() == 2 : printError("breadth", r);
        }

        private String printError(String errorIdentifer, Rectangle r) {
            return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
        }

        public static void main(String[] args) {
            main lsp = new main();

            lsp.calculateArea(new Rectangle());

            lsp.calculateArea(new Square());
        }

}
