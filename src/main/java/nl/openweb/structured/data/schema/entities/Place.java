package nl.openweb.structured.data.schema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Place extends Thing {
    private PostalAddress address;
    private String addressAsString;

    protected Place(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.addressAsString = builder.addressAsString;
    }

    @JsonProperty("address")
    public Object getAddress() {
        Object result = this.address;
        if (result == null) {
            result = this.addressAsString;
        }
        return result;
    }

    public static class Builder extends Thing.Builder {
        private PostalAddress address;
        private String addressAsString;


        public Builder setAddress(PostalAddress address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(String address) {
            this.addressAsString = address;
            return this;
        }

        @Override
        public Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            super.setDescription(description);
            return this;
        }

        @Override
        public Builder setImage(String image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setImage(ImageObject image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Thing.Builder setSameAs(String[] sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Builder setSubjectOf(Thing subjectOf) {
            super.setSubjectOf(subjectOf);
            return this;
        }

        @Override
        public Place build() {
            return new Place(this);
        }
    }
}
