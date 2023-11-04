/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGMINHAT
 */
public class NewTagHandler extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag.The implementation of this
 method is provided by the tag library developer, and handles all tag
 processing, body iteration, etc.
     * @throws jakarta.servlet.jsp.JspException
    
     */
    @Override
    public void doTag() throws JspException {
        jakarta.servlet.jsp.JspWriter out = getJspContext().getOut();
        
        try {
            out.print("<h1>");
            out.print("chao may");
             out.print("</h1>");
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            jakarta.servlet.jsp.tagext.JspFragment f = getJspBody();
            if (f != null) {
                try {
                    f.invoke(out);
                } catch (jakarta.servlet.jsp.JspException ex) {
                    Logger.getLogger(NewTagHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in NewTagHandler tag", ex);
        }
    }
    
}
