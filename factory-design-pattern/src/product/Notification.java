package product;

public abstract class Notification {

    private String header;
    private String body;

    public abstract String send();

    public Notification( String header, String body){
        this.header=header;
        this.body=body;
    }

    public Notification(){}

    public void setHeader(String header){
        this.header = header;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getHeader(){
        return this.header;
    }

    public String getBody(){
        return this.body;
    }
}
