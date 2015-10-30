
package controladores;

import modelos.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alexandre.chaves
 */
@Controller
public class ProdutoControlador {
   
   @RequestMapping("/produto")
   public ModelAndView obterProduto(){
       
       ModelAndView mav;
       mav = new ModelAndView("listar-produtos");
       
       
       Produto p;
       p = new Produto();
       p.setId(1L);
       p.setNome("iphone");
       p.setPrecoUnitario(9999.99f);
       p.setQuantidade(1);
       mav.addObject("produto",p);
       
       return mav;
   }
    
    
}
