package core.basesyntax.model;

public class StorageTransaction {
    private TypeActivity typeActivity;
    private String fruit;
    private int quantity;

    public StorageTransaction(TypeActivity typeActivities, String fruit, int quantity) {
        this.typeActivity = typeActivities;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public TypeActivity getTypeActivity() {
        return typeActivity;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public enum TypeActivity {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private String code;

        TypeActivity(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
