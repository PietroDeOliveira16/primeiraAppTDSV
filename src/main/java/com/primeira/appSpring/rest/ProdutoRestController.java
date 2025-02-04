package com.primeira.appSpring.rest;

import com.primeira.appSpring.model.M_Produto;
import com.primeira.appSpring.service.S_Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ProdutoRestController {
    private final S_Produto s_produto;

    public ProdutoRestController(S_Produto s_produto) {
        this.s_produto = s_produto;
    }

    @GetMapping("/rest/produto")
    public M_Produto getProduto(@RequestParam("codigo") String codigo){
        M_Produto baseProduto = s_produto.findByCode(codigo);
        M_Produto produto = new M_Produto();
        produto.setId(baseProduto.getId());
        produto.setNome(baseProduto.getNome());
        produto.setPreco(baseProduto.getPreco());
        return produto;
    }
}
