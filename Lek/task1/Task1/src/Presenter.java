public class Presenter {
    private View view;
    private Model model;
    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int res = model.result();
        view.print(res,"Sum: ");
    }
    
}
