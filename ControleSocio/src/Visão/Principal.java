package Visão;
import Aplicação.*;
import Persistencia.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op =0,op2=0;
		//Socio socio = new Socio();
		SocioDAO sd = new SocioDAO();
		DependenteDAO dd = new DependenteDAO();
		ArrayList<Socio> lista = new ArrayList<>();
		ArrayList<Dependente> listaD = new ArrayList<>();
		String auxcpf;
				do {
					try {
						System.out.println("Menu Principal");
						System.out.println("1 - Buscar Socio ");
						System.out.println("2 - Incluir Socio ");
						System.out.println("3 - Alterar Socio ");
						System.out.println("4 - Excluir Socio ");
						System.out.println("5 - Relatório Sócio ");
						System.out.println("6 - Sair do Sistema ");
						System.out.println("Digite uma das 6 opçoes");
						op = teclado.nextInt();
					}catch(java.util.InputMismatchException e) {
						System.out.println("Tentou digitar algo diferente de um inteiro");
						System.out.println(e);
					}catch(Exception e) {
						System.out.println("Deu erro");
						System.out.println(e);
					}
					switch(op) {
					case 1:
						Socio soc = null;
						try {
							teclado.nextLine();
							System.out.println("Digite o seu CPF");
							auxcpf = teclado.nextLine();
							 soc = sd.Buscar(auxcpf); 
						}catch(Exception e) {
							System.out.println("Houve um erro:"+e);
						}
						if(soc != null) {
							System.out.println("Nome: "+soc.getNome());
							System.out.println("CPF: "+soc.getCPF());
							System.out.println("Data_adm"+soc.getData_adm());
							do {
								System.out.println("Menu Secundário");
								System.out.println("1 - Buscar Dependente");
								System.out.println("2 - Incluir Dependente");
								System.out.println("3 - Alterar Dependente");
								System.out.println("4 - Excluir Dependente ");
								System.out.println("5 - Relatório Dependente");
								System.out.println("6 - Voltar ");
								try {
									teclado.next();
									System.out.println("Digite uma das opçoes");
									op2 = teclado.nextInt();
								}catch(java.util.InputMismatchException e) {
									System.out.println("Tentou Digitar algo que não é um inteiro");
									System.out.println(e);
								}catch(Exception e) {
									System.out.println("Deu erro");
									System.out.println(e);
								}
								switch(op2) {
								case 1:
									try {
										teclado.nextLine();
										System.out.println("Digite a ID do seu dependente");
										Dependente d =dd.Buscar(teclado.nextInt());
										if (d!=null) {
											System.out.println("Seu ID: "+d.getId());
											System.out.println("Seu Nome: "+d.getNome());
											System.out.println("Sua Idade: "+d.getIdade());
											System.out.println("Cpf do seu Socio: "+d.getCpf());
										}else {
											System.out.println("Sua busca não encontrou nada");
										}
									}catch(Exception e) {
										System.out.println("Aconteceu um problema na Busca");
									}
									break;
								case 2:
									Dependente novo = new Dependente();
									try {
										teclado.nextLine();
										System.out.println("Digite o Id do seu Dependente");
										int auxId = teclado.nextInt();
										Dependente teste=dd.Buscar(auxId);
									if (teste == null) {
										novo.setId(auxId);
										teclado.nextLine();
										System.out.println("Digite seu Nome");
										novo.setNome(teclado.nextLine());
										teclado.nextLine();
										System.out.println("Digite o CPF do seu Dependente");
										String auxcpfD = teclado.nextLine();
										Socio testeS=sd.Buscar(auxcpfD);
										if (testeS==null) {
											System.out.println("CPF INVALIDO ");
											}else {
												System.out.println("Digite a idade do seu Dependente");
												novo.setIdade(teclado.nextInt());
												novo.setCpf(auxcpfD);
												dd.Adicionar(novo);
											}
										}
									}catch(Exception e) {
										System.out.println("Deu erro"+e);
									}
									break;
								case 3:
									Dependente d = null;
									System.out.println("Digite o seu Id");
									d=dd.Buscar(teclado.nextInt());
									if (d!=null) {
										int opd;
										try {
											System.out.println("Qual Campo Gostaria de Mudar 1-ID,2-NOME,3-CPF,4-Idade");
											opd = teclado.nextInt();
											switch(opd) {
											case 1:
												try {
													int idnovo;
												Dependente testeD = null;
												System.out.println("Digite o novo ID");
												int idantigo = d.getId();
												idnovo = teclado.nextInt();
												testeD =dd.Buscar(idnovo);
												if (testeD ==null) {
													d.setId(idnovo);
													dd.Atualizar(d, idantigo);
												}else {
													System.out.println("Esse id ja esta sendo ultilizado");
												}
												
												
												}catch(Exception e) {
													System.out.println("Houve um erro"+e);
												}
												break;
											case 2:
												String novonome;
												int idvei = d.getId();
												teclado.nextLine();
												System.out.println("Digite o Novo nome");
												novonome = teclado.nextLine();
												d.setNome(novonome);
												dd.Atualizar(d, idvei);
												break;
											case 3:
												String novocpf;
												Socio ts = null;
												int idvelj = d.getId();
												teclado.nextLine();
												System.out.println("Digite um novo cpf");
												novocpf = teclado.nextLine();
												ts = sd.Buscar(novocpf);
												if(ts != null) {
													d.setCpf(novocpf);
													dd.Atualizar(d, idvelj);
												}else {
													System.out.println("cpf Invalido");
												}
												break;
											case 4:
												try {
													int NovaIdade;
													int idvel = d.getId();
													System.out.println("Digite a nova Idade");
													NovaIdade = teclado.nextInt();
													d.setIdade(NovaIdade);
													dd.Atualizar(d, idvel);
												}catch(Exception e) {
													System.out.println("Deu um erro");
												}
												break;
											}
										}catch(Exception e) {
											System.out.println("Houve algum erro "+e);
										}
									}else {
										System.out.println("ID INVALIDO");
									}
									break;
								case 4:
									//apagar dependente
									try {
										Dependente dds = null;
										System.out.println("Digite o seu Id");
										dds = dd.Buscar(teclado.nextInt());
										if (dds == null) {
											System.out.println("Id digitado foi Invalido");
										}else {
											dd.Deletar(dds);
										}
									}catch(Exception e) {
										System.out.println("Erro na hora de deletar"+e);
									}
									break;
								case 5:
									//relatorio dependente
									Socio tss = null;
									teclado.nextLine();
									System.out.println("Digite o CPF do Socio");
									String auxcp = teclado.nextLine();
									tss = sd.Buscar(auxcp);
									if (tss != null) {
										listaD = dd.relatorio(tss);
										for(int i=0;i<listaD.size();i++) {
											System.out.println("ID: "+listaD.get(i).getId());
											System.out.println("Nome: "+listaD.get(i).getNome());
											System.out.println("Idade: "+listaD.get(i).getIdade());
											System.out.println("CPF:  "+listaD.get(i).getCpf());
										}
									}else {
										System.out.println("Esse CPF não tem Dependentes");
									}
								case 6:
									System.out.println("Voltando");
									break;
								default:
									System.out.println("Opção Invalida");
								}

							}while(op2!=6);							
						}else {
							System.out.println("Não foi achado esse Socio");
						}
						break;
					case 2:
						Socio auxsoc = new Socio();
						String auxnome;
						String auxdata;
						String auxcpff;
						teclado.next();
						System.out.println("Digite seu Nome");
						teclado.nextLine();
						auxnome = teclado.nextLine();
						auxsoc.setNome(auxnome);
						teclado.nextLine();
						System.out.println("Digite seu CPF");
						auxcpff = teclado.nextLine();
						auxsoc.setCPF(auxcpff);
						System.out.println("Digite sua Data de Adm");
						auxdata = teclado.nextLine();
						auxsoc.setData_adm(auxdata);
						sd.Incluir(auxsoc);
						break;
					case 3:
						teclado.nextLine();
						Socio socio = null;
						System.out.println("Digite o seu CPF");
						//teclado.next();
						auxcpf = teclado.nextLine();
						
						socio=sd.Buscar(auxcpf);
						
						if(socio != null) {
							try {
							teclado.next();
							int op5;
							System.out.println("Digite qual o Dado gostaria de alterar 1-Nome,2-Data_Adm,3-CPF ");
							op5 = teclado.nextInt();
							switch(op5) {
							case 1:
								teclado.nextLine();
								
								System.out.println("Digite o nome");
								String auxnomee = teclado.nextLine();
								socio.setNome(auxnomee);
								sd.Atualizar(socio);
								break;
							case 2:
								teclado.nextLine();
								
								System.out.println("Digite a Data ");
								String auxData = teclado.nextLine();
								socio.setData_adm(auxData);
								sd.Atualizar(socio);
								break;
							case 3: 
								teclado.nextLine();
								Socio testes = new Socio();
								System.out.println("Digite o novo CPF");
								//String cpfvelho = auxcpf;
								String auxcpfff = teclado.nextLine();
								System.out.println(auxcpfff);
								testes = sd.Buscar(auxcpfff);
								if(testes == null) {
									///socio.setCPF(auxcpfff);
									//System.out.println(socio.getCPF());
									//System.out.println(cpfvelho);
								sd.AtualizarCPF(socio, auxcpfff);
								}else {
									System.out.println("Esse cpf ja esta sendo ultilizado");
								}
								//System.out.println(auxcpf);
								//System.out.println(socio.getData_adm());
								//System.out.println(socio.getNome());
								//System.out.println(socio.getCPF());
								break;
							default:
								System.out.println("Invalido");
								break;
							}
						}catch(java.util.InputMismatchException e) {
							System.out.println("Deu erro "+e);	
						}catch(Exception e) {
							System.out.println("Deu erro "+e);
							}
						}
						break;
					case 4:
						//boolean flag = false;
							try {
								//flag = true;
								teclado.next();
								System.out.println("Desejar Realmente deletar sua conta 1-sim 2- não");
								int op5 = teclado.nextInt();
								switch(op5) {
								case 1:
									teclado.nextLine();
									System.out.println("Digite o seu CPF ");
									auxcpf = teclado.nextLine();
									socio = sd.Buscar(auxcpf);
									sd.Deletar(auxcpf);
									break;
								case 2:
									System.out.println("Ação Cancelada");
									break;
								default: 
									System.out.println("Invalido");
									break;
								}
							}catch(java.util.InputMismatchException e) {
								//flag = false;
								System.out.println("Deu erro"+e);
								
							}catch(Exception e) {
								//flag = false;
								System.out.println("Deu erro"+e);
							}
						break;
					case 5:
						 lista = sd.Relatorio();
						for (int i=1;i<lista.size();i++) {
							System.out.println(lista.get(i).getNome());
							System.out.println(lista.get(i).getCPF());
							System.out.println(lista.get(i).getData_adm());
						}
						break;
					case 6: 
						System.out.println("Sair do Sistema/n");
						break;
					}
				}while(op!=6);
	}

}
