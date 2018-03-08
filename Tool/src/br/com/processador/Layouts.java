package br.com.processador;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Layouts {
	
	// LAYOUTS
	private String stFrameLayout = "0";
	private String stLinearLayout = "0";
	private String stTableLayout = "0";
	private String stGridLayout = "0";
	private String stRelativeLayout = "0";
	
	// WIDGETS
	private String stTextView = "0";
	private String stText = "0";
	private String stButton = "0";
	private String stRadioButton = "0";
	private String stCheckBox = "0";
	private String stSwitch = "0";
	private String stToggleButton = "0";
	private String stImageView = "0";
	private String stProgressBar = "0";
	private String stSeekBar = "0";
	private String stRatingBar = "0";
	private String stSpinner = "0";
	private String stWebView = "0";
	
	// TEXT FIELD
	private String stEditText = "0";
	private String stPersonName = "0";
	private String stPassword = "0";
	private String stPhone = "0";
	private String stMultilineText = "0";
	private String stNumber = "0";
	
	// CONTAINERS
	private String stRadioGroup = "0";
	private String stListView = "0";
	private String stGridView = "0";
	
	public String getStFrameLayout() {
		return stFrameLayout;
	}
	public void setStFrameLayout(String stFrameLayout) {
		this.stFrameLayout = stFrameLayout;
	}
	public String getStLinearLayout() {
		return stLinearLayout;
	}
	public void setStLinearLayout(String stLinearLayout) {
		this.stLinearLayout = stLinearLayout;
	}
	public String getStTableLayout() {
		return stTableLayout;
	}
	public void setStTableLayout(String stTableLayout) {
		this.stTableLayout = stTableLayout;
	}
	public String getStGridLayout() {
		return stGridLayout;
	}
	public void setStGridLayout(String stGridLayout) {
		this.stGridLayout = stGridLayout;
	}
	public String getStRelativeLayout() {
		return stRelativeLayout;
	}
	public void setStRelativeLayout(String stRelativeLayout) {
		this.stRelativeLayout = stRelativeLayout;
	}
	public String getStTextView() {
		return stTextView;
	}
	public void setStTextView(String stTextView) {
		this.stTextView = stTextView;
	}
	public String getStText() {
		return stText;
	}
	public void setStText(String stText) {
		this.stText = stText;
	}
	public String getStButton() {
		return stButton;
	}
	public void setStButton(String stButton) {
		this.stButton = stButton;
	}
	public String getStRadioButton() {
		return stRadioButton;
	}
	public void setStRadioButton(String stRadioButton) {
		this.stRadioButton = stRadioButton;
	}
	public String getStCheckBox() {
		return stCheckBox;
	}
	public void setStCheckBox(String stCheckBox) {
		this.stCheckBox = stCheckBox;
	}
	public String getStSwitch() {
		return stSwitch;
	}
	public void setStSwitch(String stSwitch) {
		this.stSwitch = stSwitch;
	}
	public String getStToggleButton() {
		return stToggleButton;
	}
	public void setStToggleButton(String stToggleButton) {
		this.stToggleButton = stToggleButton;
	}
	public String getStImageView() {
		return stImageView;
	}
	public void setStImageView(String stImageView) {
		this.stImageView = stImageView;
	}
	public String getStProgressBar() {
		return stProgressBar;
	}
	public void setStProgressBar(String stProgressBar) {
		this.stProgressBar = stProgressBar;
	}
	public String getStSeekBar() {
		return stSeekBar;
	}
	public void setStSeekBar(String stSeekBar) {
		this.stSeekBar = stSeekBar;
	}
	public String getStRatingBar() {
		return stRatingBar;
	}
	public void setStRatingBar(String stRatingBar) {
		this.stRatingBar = stRatingBar;
	}
	public String getStSpinner() {
		return stSpinner;
	}
	public void setStSpinner(String stSpinner) {
		this.stSpinner = stSpinner;
	}
	public String getStWebView() {
		return stWebView;
	}
	public void setStWebView(String stWebView) {
		this.stWebView = stWebView;
	}
	public String getStPersonName() {
		return stPersonName;
	}
	public void setStPersonName(String stPersonName) {
		this.stPersonName = stPersonName;
	}
	public String getStPassword() {
		return stPassword;
	}
	public void setStPassword(String stPassword) {
		this.stPassword = stPassword;
	}
	public String getStPhone() {
		return stPhone;
	}
	public void setStPhone(String stPhone) {
		this.stPhone = stPhone;
	}
	public String getStMultilineText() {
		return stMultilineText;
	}
	public void setStMultilineText(String stMultilineText) {
		this.stMultilineText = stMultilineText;
	}
	public String getStNumber() {
		return stNumber;
	}
	public void setStNumber(String stNumber) {
		this.stNumber = stNumber;
	}
	public String getStRadioGroup() {
		return stRadioGroup;
	}
	public void setStRadioGroup(String stRadioGroup) {
		this.stRadioGroup = stRadioGroup;
	}
	public String getStListView() {
		return stListView;
	}
	public void setStListView(String stListView) {
		this.stListView = stListView;
	}
	public String getStGridView() {
		return stGridView;
	}
	public void setStGridView(String stGridView) {
		this.stGridView = stGridView;
	}
	public String getStEditText() {
		return stEditText;
	}
	public void setStEditText(String stEditText) {
		this.stEditText = stEditText;
	}

	public Layouts mapearLayout(Arquivos arqs)
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Layouts layouts = new Layouts();
		
		long dbFrameLayout = 0;
		long dbLinearLayout = 0;
		long dbTableLayout = 0;
		long dbGridLayout = 0;
		long dbRelativeLayout = 0;

		long dbTextView = 0;
		long dbText = 0;
		long dbButton = 0;
		long dbRadioButton = 0;
		long dbCheckBox = 0;
		long dbSwitch = 0;
		long dbToggleButton = 0;
		long dbImageView = 0;
		long dbProgressBar = 0;
		long dbSeekBar = 0;
		long dbRatingBar = 0;
		long dbSpinner = 0;
		long dbWebView = 0;

		long dbPersonName = 0;
		long dbPassword = 0;
		long dbPhone = 0;
		long dbMultilineText = 0;
		long dbNumber = 0;

		long dbRadioGroup = 0;
		long dbListView = 0;
		long dbGridView = 0;	
		long dbEditText = 0;
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			for (String stArqLayout : arqs.getArqsLayout()){
				Document doc = builder.parse(stArqLayout);
				
				// LAYOUT
				NodeList nodeFrameLayout = doc.getElementsByTagName("FrameLayout");
				dbFrameLayout += nodeFrameLayout.getLength();
				
				NodeList nodeLinearLayout = doc.getElementsByTagName("LinearLayout");
				dbLinearLayout += nodeLinearLayout.getLength();
				
				NodeList nodeRelativeLayout = doc.getElementsByTagName("RelativeLayout");
				dbRelativeLayout += nodeRelativeLayout.getLength();
				
				NodeList nodeTableLayout = doc.getElementsByTagName("TableLayout");
				dbTableLayout += nodeTableLayout.getLength();

				NodeList nodeGridLayout = doc.getElementsByTagName("GridLayout");
				dbGridLayout += nodeGridLayout.getLength();

				
				// WIDGETS
				NodeList nodeTextView = doc.getElementsByTagName("TextView");
				dbTextView += nodeTextView.getLength();
				
				NodeList nodeImageView = doc.getElementsByTagName("ImageView");
				dbImageView += nodeImageView.getLength();

				NodeList nodeButton = doc.getElementsByTagName("Button");
				dbButton += nodeButton.getLength();

				NodeList nodeRadioButton = doc.getElementsByTagName("RadioButton");
				dbRadioButton += nodeRadioButton.getLength();

				NodeList nodeCheckBox = doc.getElementsByTagName("CheckBox");
				dbCheckBox += nodeCheckBox.getLength();

				NodeList nodeSwitch = doc.getElementsByTagName("Switch");
				dbSwitch += nodeSwitch.getLength();

				NodeList nodeToggleButton = doc.getElementsByTagName("ToggleButton");
				dbToggleButton += nodeToggleButton.getLength();

				NodeList nodeProgressBar = doc.getElementsByTagName("ProgressBar");
				dbProgressBar += nodeProgressBar.getLength();

				NodeList nodeSeekBar = doc.getElementsByTagName("SeekBar");
				dbSeekBar += nodeSeekBar.getLength();

				NodeList nodeRatingBar = doc.getElementsByTagName("RatingBar");
				dbRatingBar += nodeRatingBar.getLength();

				NodeList nodeSpinner = doc.getElementsByTagName("Spinner");
				dbSpinner += nodeSpinner.getLength();

				NodeList nodeWebView = doc.getElementsByTagName("WebView");
				dbWebView += nodeWebView.getLength();
				
				// TEXT FIELD
				NodeList nodeEditText = doc.getElementsByTagName("EditText");
				dbEditText += nodeEditText.getLength();
				
			    for (int j = 0; j < nodeEditText.getLength(); ++j)
			    {
			        Element elEditText = (Element) nodeEditText.item(j);
			        String stInputType = elEditText.getAttribute("android:inputType");
			        
			        if(stInputType.equals("text"))
			        	dbText += 1;
			        else if(stInputType.equals("textCapWords"))
						dbPersonName += 1;
					else if(stInputType.equals("textPassword"))
						dbPassword += 1;
					else if(stInputType.equals("phone"))
						dbPhone += 1;
					else if(stInputType.equals("textMultiLine"))
						dbMultilineText += 1;
					else if(stInputType.equals("number"))
						dbNumber += 1;
			    }
				
				// CONTAINERS
				NodeList nodeRadioGroup = doc.getElementsByTagName("RadioGroup");
				dbRadioGroup += nodeRadioGroup.getLength();

				NodeList nodeListView = doc.getElementsByTagName("ListView");
				dbListView += nodeListView.getLength();
				
				NodeList nodeGridView = doc.getElementsByTagName("GridView");
				dbGridView += nodeGridView.getLength();
				
			}

		} catch (Exception ex) { 
	         ex.printStackTrace (); 
	    }

		// LAYOUT
		layouts.setStFrameLayout("" + dbFrameLayout);
		layouts.setStLinearLayout("" + dbLinearLayout);
		layouts.setStRelativeLayout("" + dbRelativeLayout);
		layouts.setStTableLayout("" + dbTableLayout);
		layouts.setStGridLayout("" + dbGridLayout);
		
		// WIDGETS
		layouts.setStEditText("" + dbEditText);
		layouts.setStTextView("" + dbTextView);
		layouts.setStImageView("" + dbImageView);
		layouts.setStText("" + dbText);
		layouts.setStButton("" + dbButton);
		layouts.setStRadioButton("" + dbRadioButton);
		layouts.setStCheckBox("" + dbCheckBox);
		layouts.setStSwitch("" + dbSwitch);
		layouts.setStToggleButton("" + dbToggleButton);
		layouts.setStProgressBar("" + dbProgressBar);
		layouts.setStSeekBar("" + dbSeekBar);
		layouts.setStRatingBar("" + dbRatingBar);
		layouts.setStSpinner("" + dbSpinner);
		layouts.setStWebView("" + dbWebView);
		
		// TEXT FIELD
		layouts.setStText("" + dbText);
		layouts.setStPersonName("" + dbPersonName);
		layouts.setStPassword("" + dbPassword);
		layouts.setStPhone("" + dbPhone);
		layouts.setStMultilineText("" + dbMultilineText);
		layouts.setStNumber("" + dbNumber);
		
		// CONTAINERS
		layouts.setStRadioGroup("" + dbRadioGroup);
		layouts.setStListView("" + dbListView);
		layouts.setStGridView("" + dbGridView);
		
		return layouts;
	}
}
