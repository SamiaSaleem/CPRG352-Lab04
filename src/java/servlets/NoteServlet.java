/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.Note;

/**
 *
 * @author 816386
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
          //Capture the parameters from the POST request (the form)
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note note = new Note(title,content);
        request.setAttribute("note", note);
        
         // validation: if the parameters don't exist or are empty, show the form again
        if( title == null || title.equals("") || content == null || content.equals("")){
            // Create a helpful message to send to the user
            //request.setAttribute("message", "Invalid entry. Please enter both a first and last name.");
            request.setAttribute("invalid", true);
            // forward the reuqest and response objects to the JSP
            // display the form again
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;// Very important! Stop the code call.
        }
        
        // display the helloWorld JSP
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
                pw.print(title);
                pw.print(content);
                pw.close();


    }


 

}
