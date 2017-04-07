package optGroupComboBox.Java.Enum;

public enum ComboBoxOptions {
    GROUP1("Group1","NOT_OPTION"),
    A("A","OPTION"),
    B("B","OPTION"),
    GROUP2("Group2","NOT_OPTION"),
    C("C","OPTION"),
    D("D","OPTION");

    private String label;
    private String isOption;

    ComboBoxOptions(String label, String isOption){
        this.label = label;
        this.isOption = isOption;
    }

    public String getLabel(){
        return this.label;
    }

    public String isOption(){
        return this.isOption;
    }

}
