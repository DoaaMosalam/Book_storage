public class author {

    private String mAuthor;
    private String mNameBook;
    private String mMail;
    private long mPhone;
    private long mId;

    public author(String Author, String NameBook, String Mail, long Phone, long Id) {
        this.mAuthor = Author;
        this.mNameBook = NameBook;
        this.mMail = Mail;
        this.mPhone = Phone;
        this.mId = Id;
    }
//Creat constructor empty

    public author() {

    }
//creat constructor to Class Scanner.
    public author(String next) {

    }

    public author(long televone) {

    }
    public String get_Author() {
        return mAuthor;
    }

    public String get_NameBook() {
        return mNameBook;
    }

    public String get_Mail() {
        return mMail;
    }

    public long get_Phone() {
        return mPhone;
    }

    public long get_Id() {
        return mId;
    }

    @Override
    public String toString() {
        return "author{" +
                "mAuthor='" + mAuthor + '\'' +
                ", mNameBook='" + mNameBook + '\'' +
                ", mMail='" + mMail + '\'' +
                ", mPhone=" + mPhone +
                ", mId=" + mId +
                '}';
    }
}
