

import java.io.Serializable;

/**
 * @author bchow
 *
 */

public class Label implements Serializable {
	private String login;
	private String labelText;
    private int qty;

    public Label(String labelText, String login) {
        this.labelText = labelText;
        this.login = login;
        this.qty = 1;
    }

    public Label(String labelText, String login, int qty) {
        this.labelText = labelText;
        this.login = login;
        this.qty = qty;
    }
    
    public String getLabelText() {
		return labelText;
	}
	public String getLogin() {
		return login;
	}
	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}
	public void setLogin(String login) {
		this.login = login;
	}

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
