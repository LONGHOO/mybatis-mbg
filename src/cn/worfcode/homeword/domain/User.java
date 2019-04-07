package cn.worfcode.homeword.domain;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.head_img
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String headImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.file_Data
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String fileData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.file_data_name
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String fileDataName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.head_img
     *
     * @return the value of user.head_img
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.head_img
     *
     * @param headImg the value for user.head_img
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.file_Data
     *
     * @return the value of user.file_Data
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getFileData() {
        return fileData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.file_Data
     *
     * @param fileData the value for user.file_Data
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setFileData(String fileData) {
        this.fileData = fileData == null ? null : fileData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.file_data_name
     *
     * @return the value of user.file_data_name
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getFileDataName() {
        return fileDataName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.file_data_name
     *
     * @param fileDataName the value for user.file_data_name
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setFileDataName(String fileDataName) {
        this.fileDataName = fileDataName == null ? null : fileDataName.trim();
    }
}