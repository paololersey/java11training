package annotations;

public class JsonType {
    
    public class Point {
    
        @JsonField(type=JsonField.Type.STRING, name="name")
        private String _name;

        @JsonField(type=JsonField.Type.INT)
        private int  y;

    }
}
