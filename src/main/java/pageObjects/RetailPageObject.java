package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//a[text()= 'Edit your affiliate information']")
	private WebElement editAffiliateInformation;
	
	public void editAffiliateInformation() {
		editAffiliateInformation.click();
	}
	
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransfareRadioButton;
	
	public void banktranfareRadioButton() {
		bankTransfareRadioButton.click();
	}
	
	@FindBy(xpath ="//input[@name='bank_name']")
	private WebElement bankName;
	
	public void bankName(String bName) {
		WebDriverUtility.enterValue(bankName, bName);
	}
	
	@FindBy(xpath ="//input[@name='bank_branch_number']")
	private WebElement abaNumber;
	
	public void abaNumber(String aNumber) {
		WebDriverUtility.enterValue(abaNumber, aNumber);
	}
	
	@FindBy(xpath ="//input[@name='bank_swift_code']")
	private WebElement swiftCode;
	
	public void swiftCode(String sCode) {
		WebDriverUtility.enterValue(swiftCode, sCode);
	}
	
	@FindBy(xpath ="//input[@name='bank_account_name']")
	private WebElement accountName;
	
	public void accountName(String acctName) {
		WebDriverUtility.enterValue(accountName, acctName);
	}
	
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumber;
	
	public void bankAccountNumberAffiliate(String acctNumber) {
		WebDriverUtility.enterValue(accountNumber, acctNumber);
	}
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continueButtonAffiliate;
	
	public void continueButtonAffiliate() {
		continueButtonAffiliate.click();
	}
	
	@FindBy(xpath ="//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	
	public void editYourAccountInformation() {
		editYourAccountInformation.click();
	}
	
	@FindBy(xpath ="//input[@name='firstname']")
	private WebElement firstName;
	
	public void firstName(String ffName) {
		WebDriverUtility.enterValue(firstName, ffName);
	}
	
	@FindBy(xpath ="//input[@name='lastname']")
	private WebElement lastName;
	
	public void lastName(String lName) {
		WebDriverUtility.enterValue(lastName, lName);
	}
	
	@FindBy(xpath ="//input[@name='email']")
	private WebElement email;
	
	public void email(String aemail) {
		WebDriverUtility.enterValue(email, aemail);
	}
	
	@FindBy(xpath ="//input[@name='telephone']")
	private WebElement telephone;
	
	public void telephone(String ttelephone) {
		WebDriverUtility.enterValue(telephone, ttelephone);
	}
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continueButtonEditAccount;
	
	public void continueButtonEditAccount() {
		continueButtonEditAccount.click();
	}
	
	

}
