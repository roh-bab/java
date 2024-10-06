

public class Question{
    private int QuestionNo;
    private String Qustion;
    private String opt4;
    private String opt3;
    private String opt2;
    private String opt1;
    private String rightAnswer;
    private String selectedAnswer;

    public Question(int QuestionNo, String Qustion, String opt1, String opt2, String opt3, String opt4, String selectedAnswer) {
        this.QuestionNo = QuestionNo;
        this.Qustion = Qustion;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.selectedAnswer = selectedAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(QuestionNo);
        sb.append(" : ").append(Qustion);
        sb.append(" Options ").append(opt1);
        sb.append(" ").append(opt2);
        sb.append(" ").append(opt3);
        sb.append(" ").append(opt4);
        return sb.toString();
    }

    public int getQuestionNo() {
        return QuestionNo;
    }

    public void setQuestionNo(int QuestionNo) {
        this.QuestionNo = QuestionNo;
    }

    public String getQustion() {
        return Qustion;
    }

    public void setQustion(String Qustion) {
        this.Qustion = Qustion;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    String getAnswer() {
        return this.selectedAnswer;
    }
    
}