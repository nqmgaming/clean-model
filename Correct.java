public class Group {
    private String id;
    private String name;
    private String description;
    private String user_id;
    private String created_at;
    private String updated_at;
    private int status;

    private Group(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.user_id = builder.user_id;
        this.created_at = builder.created_at;
        this.updated_at = builder.updated_at;
        this.status = builder.status;
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String user_id;
        private String created_at;
        private String updated_at;
        private int status;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setUserId(String user_id) {
            this.user_id = user_id;
            return this;
        }

        public Builder setCreatedAt(String created_at) {
            this.created_at = created_at;
            return this;
        }

        public Builder setUpdatedAt(String updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Builder setStatus(int status) {
            this.status = status;
            return this;
        }

        public Group build() {
            return new Group(this);
        }
    }

    // getters and setters...
}
