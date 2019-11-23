/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.dao;

import br.com.lpii.jdbc.ConnectionFactory;
import br.com.lpii.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * ?
 * Classe responsável pela interação com o banco de dados
 */
public class AlunoDAO {

    private Connection con;

    public AlunoDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    // Método cadastrar aluno
    public void cadastrarAluno(Aluno aluno) {
        try {
            // Comando SQL
            String sql = "INSERT INTO aluno (matricula, nome, cpf, email, telefone, perfil, senha, proposta) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            // Conectar o banco de dados e organizar o SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            // insere os valores no sql
            stmt.setInt(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getCpf());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getPerfil());
            stmt.setString(7, aluno.getSenha());
            stmt.setString(8, aluno.getProposta());

            //Executa sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }

    // Método alterar aluno
    public void alterarAluno(Aluno aluno) {
        try {
            // Comando SQL
            String sql = "UPDATE aluno SET nome = ?, cpf = ?, email = ?, telefone = ?, " +
                    "perfil = ? WHERE matricula = ?";
            
            
            // Conectar o banco de dados e organizar o SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            // insere os valores no sql
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getTelefone());
            stmt.setString(5, aluno.getPerfil());
            stmt.setInt(6, aluno.getMatricula());

            //Executa sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }

    // Método exluir aluno
    public void excluirAluno(Aluno aluno) {

        try {
            
            // Comando SQL
            String sql = "DELETE FROM aluno WHERE matricula = ?";
            // Conectar o banco de dados e organizar o SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            // insere os valores no sql
            stmt.setInt(1, aluno.getMatricula());

            //Executa sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
        
    }

    // Método para listar todos os alunos
    public List<Aluno> listarAlunos() {
        // try...catch para tratar eventual erro
        try {
            // Cria a lista
            List<Aluno> lista = new ArrayList<>();
            // Cria comando sql
            String sql = "SELECT * FROM aluno ORDER BY matricula";
            // prepara sql para execução
            PreparedStatement stmt = con.prepareStatement(sql);
            // o resultado do select é armazenada em um objeto ResultSet
            ResultSet rs = stmt.executeQuery();
            /**
             * Armazena o resultado da pesquisa que está no ResultSet na nossa
             * lista
             */
            while (rs.next()) {
                // Para casda ocorrência de rs é gerado um novo objeto Aluno
                Aluno aluno = new Aluno();
                // É setado os atributos. Os parâmetros do get são os nomes das colunas
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setPerfil(rs.getString("perfil"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setProposta(rs.getString("proposta"));
                // Após setar todos os atributos, o objeto é adicionado à lista
                lista.add(aluno);
            }

            return lista;

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "Erro ao carregar alunos: " + error);
            return null;
        }

    }
    
    // Método para pesquisar alunos por nome
    
    public List<Aluno> buscaAlunos(String param) {
        // try...catch para tratar eventual erro
        try {
            // Cria a lista
            List<Aluno> lista = new ArrayList<>();
            // Cria comando sql
            String sql = "SELECT * FROM aluno WHERE matricula LIKE ? OR nome LIKE ? ORDER BY matricula";
            // prepara sql para execução
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, param);
            stmt.setString(2, param);
            // o resultado do select é armazenada em um objeto ResultSet
            ResultSet rs = stmt.executeQuery();
            /**
             * Armazena o resultado da pesquisa que está no ResultSet na nossa
             * lista
             */
            while (rs.next()) {
                // Para casda ocorrência de rs é gerado um novo objeto Aluno
                Aluno aluno = new Aluno();
                // É setado os atributos. Os parâmetros do get são os nomes das colunas
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setPerfil(rs.getString("perfil"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setProposta(rs.getString("proposta"));
                // Após setar todos os atributos, o objeto é adicionado à lista
                lista.add(aluno);
            }

            return lista;

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "Erro ao carregar alunos: " + error);
            return null;
        }

    }
}