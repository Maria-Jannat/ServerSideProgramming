package com.cesurazure;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTimeTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                DateFormat.MEDIUM);
        getJspContext().getOut().write(df.format(new Date()));
    }
}
