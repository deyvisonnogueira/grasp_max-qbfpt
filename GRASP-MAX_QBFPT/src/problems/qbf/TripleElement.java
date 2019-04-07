package problems.qbf;

public class TripleElement {

    public final Integer index;
    public Boolean selected;
    public Boolean available;

    public TripleElement(int index) {
        this.index = index;
        this.selected = false;
        this.available = true;
    }

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Integer getIndex() {
		return index;
	}

}
