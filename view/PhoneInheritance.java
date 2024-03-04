package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("------- 집전화 -------");
        Phone phone = new Phone();
        phone.setCall("제임스");
        phone.setCompnay("금성");
        System.out.println(phone.toString());
        System.out.println("------- 휴대전화 -------");
        CellPhone cp = new CellPhone();
        cp.setCompnay("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp.toString());
        System.out.println("------- 휴대전화 -------");
        IPhone ip = new IPhone();
        ip.setCompnay("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("전송하다");
        System.out.println(ip.toString());//애플 아이폰으로 톰에게 데이터를 전송하다
        System.out.println("--------------갤럭시 노트---------------");
        //삼성 갤럭시노트로 제인에게 10인치 폰을 휴대할 수 있음을 데이터를 전송하다
        AndroidPhone ap = new AndroidPhone();
        ap.setCompnay("삼성");
        ap.setCall("제인");
        ap.setPortable(true);
        ap.setData("전송하다");
        ap.setSize("10인치");
        System.out.println(ap);
    }
}

class AndroidPhone extends IPhone{
   private String size;
    public static String BRAND = "갤럭시노트";

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "삼성{"+ '\n'+
                 "제조사='" + super.compnay + '\n' +
                  BRAND + '\n' +
                 "수신자='" + super.call + '\n' +
                " 크기='"+ size+'\n'+
                 "'이동성=" + super.portable +'\n'  +
                 "'이동유무='" + super.move + '\n'+
                 "데이터='" + super.data + '\n' +
                '}';

    }
}
class IPhone extends CellPhone {
    protected String data;
    public static String BRAND = "iPhone";

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;

    }

    @Override
    public String toString() {
        return "아이폰{" +
                "제조사='" + super.compnay + '\n' +
                BRAND + '\n' +
                "수신자='" + super.call + '\n' +
                "'이동성=" + super.portable +
                "'이동유무='" + super.move + '\n' +
                "데이터='" + data + '\n' +
                '}';
    }
}

class CellPhone extends Phone {
    protected boolean portable; // 이동성, 휴대가능성
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public String getMove() {
        return move;
    }

    public void setPortable(boolean portable) {
        if (portable) {
            this.setMove("폰을 휴대할 수 있음");
        } else {
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public void setMove(String move) {

        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사='" + super.compnay + '\'' +
                ", 수신자='" + super.call + '\'' +
                "이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}

class Phone {
    protected String compnay, call; // 인스턴스 변수 = 멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱영역

    public String getCompnay() {
        return compnay;
    }

    public String getCall() {
        return call;
    }

    public void setCompnay(String compnay) {
        this.compnay = compnay + "에서 제작하다";
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + compnay + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}