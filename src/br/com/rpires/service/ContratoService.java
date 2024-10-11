package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso ao salvar";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso ao buscar";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso ao excluir";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso ao atualizar";
    }
}
