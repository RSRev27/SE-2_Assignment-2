package com.assignment2.selenium_test.utils;

import java.util.Properties;

import org.openqa.selenium.By;

import com.assignment2.selenium_test.MyTestCase;

public class ElementsConstants {

	static Properties props = new MyTestCase().loadProperties();
	public static final By COOKIES_POLICY_ACCEPTANCE = By.xpath(props.getProperty("Cookies_Policy_Acceptance"));
	public static final By LOGIN_LINK = By.xpath(props.getProperty("Login_Link"));
	public static final By FORM_ID = By.id(props.getProperty("Form_ID"));
	public static final By LOGIN_TEXT_BOX = By.xpath(props.getProperty("Login_Text_Box"));
	public static final By LOGIN_CONTINUE = By.xpath(props.getProperty("Login_Continue"));
	public static final By LOGIN_PASSWORD_BOX = By.xpath(props.getProperty("Login_Password_Box"));
	public static final By LOGIN_BUTTON = By.xpath(props.getProperty("Login_Button"));
	public static final By SKIP_TWOFA = By.xpath(props.getProperty("Skip_TwoFA"));
	public static final By LOGIN_INVALID_MAIL_MSG = By.xpath(props.getProperty("Login_Invalid_Mail_Msg"));
	public static final By COOKIES_POLICY_ATLASSIAN = By.xpath(props.getProperty("Cookies_Policy_Atlassian"));
	public static final By CREATE_BUTTON = By.xpath(props.getProperty("Create_Button"));
	public static final By CREATE_BOARD = By.className(props.getProperty("Create_Board"));
	public static final By BOARD_TITLE = By.cssSelector(props.getProperty("Board_Title"));
	public static final By BOARD_CREATE = By.xpath(props.getProperty("Board_Create"));
	public static final By BOARD_SELECT = By.cssSelector(props.getProperty("Board_Select"));
	public static final By BOARD_OPTIONS = By.xpath(props.getProperty("Board_Options"));
	public static final By BOARD_SECTION = By.xpath(props.getProperty("Board_Section"));
	public static final By CLOSE_BUTTON_OPTION = By.cssSelector(props.getProperty("Close_Button_Option"));
	public static final By CLOSE_BUTTON = By.cssSelector(props.getProperty("Close_Button"));
	public static final By OPTIONS_ICON = By.cssSelector(props.getProperty("Options_Icon"));
	public static final By ADD_LIST = By.cssSelector(props.getProperty("Add_List"));
	public static final By LIST_TEXTBOX1 = By.cssSelector(props.getProperty("List_TextBox1"));
	public static final By LIST_TEXTBOX2 = By.cssSelector(props.getProperty("List_TextBox2"));
	public static final By ADD_LIST_BUTTON = By.cssSelector(props.getProperty("Add_List_Button"));
	public static final By ADD_LIST_BUTTON1 = By.cssSelector(props.getProperty("Add_List_Button1"));
	public static final By DELETE_BOARD_BUTTON = By.cssSelector(props.getProperty("Delete_Board_Button"));
	public static final By ADD_A_CARD1 = By.cssSelector(props.getProperty("Add_a_Card1"));
	public static final By ADD_A_CARD2 = By.cssSelector(props.getProperty("Add_a_Card2"));
	public static final By LIST1 = By.cssSelector(props.getProperty("List1"));
	public static final By LIST2 = By.cssSelector(props.getProperty("List2"));
	public static final By LIST1_ADD_A_CARD_TEXTBOX1 = By.cssSelector(props.getProperty("List1_Add_a_Card_TextBox1"));
	public static final By LIST1_ADD_A_CARD_TEXTBOX2 = By.cssSelector(props.getProperty("List1_Add_a_Card_TextBox2"));
	public static final By LIST1_CARD1 = By.cssSelector(props.getProperty("List1_Card1"));
	public static final By LIST1_CARD2 = By.cssSelector(props.getProperty("List1_Card2"));
	public static final By LIST2_ADD_A_CARD_TEXTBOX1 = By.cssSelector(props.getProperty("List2_Add_a_Card_TextBox1"));
	public static final By LIST2_CARD1 = By.cssSelector(props.getProperty("List2_Card1"));
	public static final By LIST2_CARD2 = By.cssSelector(props.getProperty("List2_Card2"));
	public static final By LIST1_CARD1_LABEL_BUTTON = By.cssSelector(props.getProperty("List1_Card1_Label_Button"));
	public static final By ADD_LABEL_SEARCHBOX = By.cssSelector(props.getProperty("Add_Label_SearchBox"));
	public static final By RED_LABEL_CHECKBOX_SELECT = By.cssSelector(props.getProperty("Red_Label_CheckBox_Select"));
	public static final By RED_LABEL_CHECKBOX = By.cssSelector(props.getProperty("Red_Label_CheckBox"));
	public static final By FILTER_BUTTON = By.cssSelector(props.getProperty("Filter_Button"));
	public static final By FILTER_SEARCHBOX = By.cssSelector(props.getProperty("Filter_SearchBox"));
	public static final By FILTER_NO_MEMBERS_CHECKBOX = By.cssSelector(props.getProperty("Filter_No_Members_CheckBox"));
	public static final By FILTER_WITH_ME_AS_MEMBERS_CHECKBOX = By.cssSelector(props.getProperty("Filter_With_Me_As_Members_CheckBox"));
	public static final By JOIN_ME_AS_A_MEMBER = By.cssSelector(props.getProperty("Join_Me_As_Member"));
	public static final By CHECK_FILTER1 = By.cssSelector(props.getProperty("Check_Filter1"));
	public static final By CHECK_FILTER2 = By.cssSelector(props.getProperty("Check_Filter2"));
	public static final By CLEAR_ALL_FILTERS = By.cssSelector(props.getProperty("Clear_All_Filters"));
	public static final By FILTER_BUTTON1 = By.cssSelector(props.getProperty("Filter_Button1"));
	public static final By ICON_OPTIONS = By.xpath(props.getProperty("Icon_Options"));
	public static final By LOGOUT_BUTTON = By.cssSelector(props.getProperty("Logout_Button"));
	public static final By LOGOUT_BUTTON_FINAL = By.xpath(props.getProperty("LogOut_Button_Final"));
	public static final By TRELLO_HOME_BUTTON = By.xpath(props.getProperty("Trello_Home_Button"));
	public static final By CLOSE_LIST1_CARD1 = By.cssSelector(props.getProperty("Close_List1_Card1"));
	public static final By CLOSE_LABEL_BUTTON = By.cssSelector(props.getProperty("Close_Label_Button"));
	public static final By CLOSE_FILTER = By.cssSelector(props.getProperty("Close_Filter"));
	public static final By DELETE_BOARD_OPTION = By.cssSelector(props.getProperty("Delete_Board"));


}
