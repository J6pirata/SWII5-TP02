import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;


@WebServlet("/MostraProduto")
public class MostraProduto extends HttpServlet {

	protected void  service(HttpServletRequest request, HttpServletResponse response)
			                throws ServletException, IOException
	{
		ControllerProduto buscaProduto = new ControllerProduto();
		
		String nomeProduto = request.getParameter("Produtos");
		Produto produto = buscaProduto.buscaProduto(nomeProduto);
		
		request.setAttribute("produto", produto);
		
		javax.servlet.RequestDispatcher ler = request.getRequestDispatcher("/MostraProduto.jsp");
	    ler.forward(request, response);
	}
}
