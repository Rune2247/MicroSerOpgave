package dk.eaaa.resource.dto;

public class CategoryDTO {
    String category;
    String type;
    int count;

    public CategoryDTO(String category, String type, int count) {
        this.category = category;
        this.type = type;
        this.count = count;
    }
    public CategoryDTO(String category, String type) {
        this.category = category;
        this.type = type;
        this.count = 0;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
