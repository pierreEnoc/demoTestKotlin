package com.enocp.demoTestKotlin.services

import com.enocp.demoTestKotlin.documents.Empresa

interface EmpresaService {
  
  fun buscarPorCnpj(cnpj: String): Empresa?
  
  fun persistir(empresa: Empresa): Empresa
}