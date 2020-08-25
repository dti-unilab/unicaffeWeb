package br.edu.unilab.unicaffe.bloqueio.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import br.edu.unilab.unicaffe.util.Log;

/**
 * 
 * Classe gerencia listas de bloqueios de processos.
 * 
 * @author Jefferson Uchôa Ponte
 * 
 *
 */
public class PerfilBloqueio {
	/**
	 * Lista com os processos que não serão bloqueados.
	 */
	private Collection<Processo> listaDeProcessosAceitos;
	/**
	 * Lista com os processo em execução pelo sistema operacional.
	 */
	private Collection<Processo> processosAtivos;

	/**
	 * Lista com os processos que foram mortos.
	 */
	private Collection<Processo> listaDeBloqueados;

	/**
	 * 
	 * @return Collection listaDeBloqueados
	 */
	public Collection<Processo> getListaDeBloqueados() {
		return listaDeBloqueados;
	}

	/**
	 * 
	 * @param listaDeBloqueados
	 */
	public void setListaDeBloqueados(Collection<Processo> listaDeBloqueados) {
		this.listaDeBloqueados = listaDeBloqueados;
	}

	/**
	 * 
	 * @return a lista de processos que não serão bloqueados.
	 */
	public Collection<Processo> getListaDeAceitos() {
		return this.listaDeProcessosAceitos;
	}

	/**
	 * 
	 * @return a lista de processos em execução pelo sistema operacional.
	 */
	public Collection<Processo> getProcessosAtivos() {
		return this.processosAtivos;
	}

	/**
	 * Constroi o objeto PerfilBloqueio.
	 */
	public PerfilBloqueio() {
		this.processosAtivos = new Vector<Processo>();
		this.listaDeProcessosAceitos = new Vector<Processo>();
		this.listaDeBloqueados = new Vector<Processo>();
	}

	/**
	 * Adiciona processo na lista de processos aceitos.
	 * 
	 * @param processo
	 */
	public void addProcesso(Processo processo) {
		this.listaDeProcessosAceitos.add(processo);

	}

	/**
	 * Define uma lista de processos aceitos.
	 * 
	 * @param processos
	 */
	public void setListaDeProcessosAceitos(Collection<Processo> processos) {
		this.listaDeProcessosAceitos = processos;
	}

	/**
	 * 
	 * @return processos aceitos do windows 10
	 * 
	 */
	public Collection<Processo> buscaAceitosWindows10() {
		Collection<Processo> lista = new Vector<Processo>();
		lista.add(new Processo("ASCService.exe", ""));
		lista.add(new Processo("BrowserCleaner.exe", ""));
		lista.add(new Processo("ctfmon.exe", ""));
		lista.add(new Processo("dasHost.exe", ""));
		lista.add(new Processo("dwm.exe", ""));
		lista.add(new Processo("fontdrvhost.exe", ""));
		lista.add(new Processo("Memory Compression", ""));
		lista.add(new Processo("Monitor.exe", ""));
		lista.add(new Processo("mqsvc.exe", ""));
		lista.add(new Processo("Monitor.exe", ""));
		lista.add(new Processo("PubMonitor.exe", ""));
		lista.add(new Processo("Registry", ""));
		lista.add(new Processo("scpbradserv.exe", ""));
		lista.add(new Processo("SecurityHealthService.exe", ""));
		lista.add(new Processo("sedsvc.exe", ""));
		lista.add(new Processo("SgrmBroker.exe", ""));
		lista.add(new Processo("tv_w32.exe", ""));
		lista.add(new Processo("tv_x64.exe", ""));
		lista.add(new Processo("WmiApSrv.exe", ""));
		lista.add(new Processo("AdobeGCClient.exe",
				"C:\\Program Files (x86)\\Common Files\\Adobe\\AdobeGCClient\\AdobeGCClient.exe"));
		lista.add(new Processo("CCFManager.exe", "C:\\Program Files\\Intel\\ConnectCenter\\bin\\CCFManager.exe"));
		lista.add(new Processo("MSASCuiL.exe", "C:\\Program Files\\Windows Defender\\MSASCuiL.exe"));
		lista.add(new Processo("backgroundTaskHost.exe", "C:\\WINDOWS\\system32\\backgroundTaskHost.ex,"));
		lista.add(new Processo("RuntimeBroker.exe", "C:\\Windows\\System32\\RuntimeBroker.exe"));
		lista.add(new Processo("sihost.exe.exe", "c:\\windows\\system32\\sihost.exe"));
		lista.add(new Processo("smartscreen.exe", "C:\\Windows\\System32\\smartscreen.exe"));
		lista.add(new Processo("taskhostw.exe", "c:\\windows\\system32\\taskhostw.exe"));
		lista.add(new Processo("SearchUI.exe",
				"C:\\Windows\\SystemApps\\Microsoft.Windows.Cortana_cw5n1h2txyewy\\SearchUI.exe"));
		lista.add(new Processo("ShellExperienceHost.exe",
				"C:\\Windows\\SystemApps\\ShellExperienceHost_cw5n1h2txyewy\\ShellExperienceHost.exe"));

		lista.add(new Processo("atieclxx.exe", "C:\\Windows\\system32\\atieclxx.exe"));
		lista.add(new Processo("sihost.exe", "C:\\Windows\\system32\\sihost.exe"));// menu
																					// iniciar
		lista.add(new Processo("WmiApSrv.exe", "C:\\Windows\\system32\\wbem\\WmiApSrv.exe"));
		lista.add(new Processo("ApplicationFrameHost.exe", "C:\\Windows\\system32\\ApplicationFrameHost.exe"));
		lista.add(new Processo("atieclxx.exe", "C:\\Windows\\system32\\atieclxx.ex"));
		lista.add(new Processo("atiesrxx.exe", "C:\\Windows\\system32\\atiesrxx.exe"));

		lista.add(new Processo("MicrosoftEdgeCP.exe",
				"C:\\Windows\\SystemApps\\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\\MicrosoftEdgeCP.exe"));
		lista.add(new Processo("MicrosoftEdge.exe",
				"C:\\Windows\\SystemApps\\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\\MicrosoftEdge.exe"));
		lista.add(new Processo("SMSvcHost.exe", "c:\\windows\\microsoft.net\\framework64\\v4.0.30319\\smsvchost.exe"));
		lista.add(new Processo("ngentask.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\NGenTask.exe"));
		lista.add(new Processo("MusNotification.exe", "C:\\WINDOWS\\system32\\MusNotification.exe"));
		lista.add(new Processo("mqsvc.exe", "C:\\WINDOWS\\system32\\mqsvc.exe"));
		lista.add(new Processo("audiodg.exe", "C:\\WINDOWS\\system32\\AUDIODG.EXE"));
		lista.add(new Processo("fontdrvhost.exe", "C:\\WINDOWS\\system32\\fontdrvhost.exe"));
		lista.add(new Processo("sedsvc.exe", "C:\\Program Files\\rempl\\sedsvc.exe"));
		lista.add(new Processo("browser_broker.exe", "C:\\WINDOWS\\system32\\browser_broker.exe"));
		lista.add(new Processo("MusNotificationUx.exe", "C:\\WINDOWS\\system32\\MusNotificationUx.exe"));
		lista.add(new Processo("dasHost.exe", "C:\\WINDOWS\\system32\\dashost.exe"));
		lista.add(new Processo("backgroundTaskHost.exe", "C:\\WINDOWS\\system32\\backgroundTaskHost.exe"));
		lista.add(new Processo("RuntimeBroker.exe", ""));
		lista.add(new Processo("MpCmdRun.exe",
				"C:\\ProgramData\\Microsoft\\Windows Defender\\platform\\4.18.1906.3-0\\MpCmdRun.exe"));
		lista.add(new Processo("eclipse-java.exe", "C:\\eclipse-java\\eclipse-java.exe"));
		lista.add(new Processo("SystemSettingsBroker.exe", "C:\\Windows\\System32\\SystemSettingsBroker.exe"));
		lista.add(new Processo("BackgroundTransferHost.exe", "C:\\WINDOWS\\system32\\BackgroundTransferHost.exe"));

		lista.add(new Processo("MicrosoftEdgeCP.exe", "C:\\Windows\\System32\\MicrosoftEdgeCP.exe"));

		lista.add(new Processo("SecurityHealthSystray.exe", "C:\\Windows\\System32\\SecurityHealthSystray.exe"));

		return lista;
	}

	/**
	 * Alimenta lista de processos aceitos.
	 */

	public void buscaAceitos() {
		this.listaDeProcessosAceitos = new Vector<Processo>(buscaAceitosWindows10());
		this.listaDeProcessosAceitos
				.add(new Processo("java.exe", "C:\\Program Files\\Java\\jre1.8.0_171\\bin\\java.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_91\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cc1.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\libexec\\gcc\\mingw32\\4.9.2\\cc1.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\PROGRA~1\\Java\\JDK18~1.0_6\\jre\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_65\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaws.exe", "C:\\Program Files (x86)\\Java\\jre1.8.0_121\\bin\\javaws.exe"));
		this.listaDeProcessosAceitos.add(new Processo("jp2launcher.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_77\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("as.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\lib\\gcc\\mingw32\\4.9.2\\..\\..\\..\\..\\mingw32\\bin\\as.exe"));
		this.listaDeProcessosAceitos.add(new Processo("collect2.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\libexec\\gcc\\mingw32\\4.9.2\\collect2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ld.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\lib\\gcc\\mingw32\\4.9.2\\..\\..\\..\\..\\mingw32\\bin\\ld.exe"));
		this.listaDeProcessosAceitos.add(new Processo("collect2.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\libexec\\gcc\\mingw32\\4.9.2\\collect2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ld.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\..\\lib\\gcc\\mingw32\\4.9.2\\..\\..\\..\\..\\mingw32\\bin\\ld.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cb_console_runner.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("ctfmon.exe", "C:\\Windows\\system32\\ctfmon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("HelpPane.exe", "C:\\Windows\\helppane.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("java.exe", "C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath\\java.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_171\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("googleearth.exee",
				"C:\\Program Files\\Google\\Google Earth Pro\\client\\googleearth.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Rgui.exe", "C:\\Program Files\\R\\R-3.4.3\\bin\\i386\\Rgui.exe,Rgui.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Pvsyst6.exe", "C:\\Program Files (x86)\\PVsyst6.7.0\\Pvsyst6.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_73\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mingw32-make.exe",
				"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\bin\\mingw32-make.exe,mingw32-make.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\eclipse_php\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.33.5\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.33.5\\GoogleCrashHandler64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sqlbrowser.exe",
				"C:\\Program Files (x86)\\Microsoft SQL Server\\90\\Shared\\sqlbrowser.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe",
				"C:\\Users\\unicafe.LABTI01.001\\eclipse\\java-oxygen\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\eclipse_java\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("XMind.exe", "C:\\Program Files (x86)\\XMind\\XMind.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("VirtualBox.exe", "C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("VBoxSVC.exe", "C:\\Program Files\\Oracle\\VirtualBox\\VBoxSVC.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("nvda_slave.exe", "C:\\Program Files (x86)\\NVDA\\nvda_slave.exe"));
		this.listaDeProcessosAceitos.add(new Processo("nvda.exe", "C:\\Program Files (x86)\\NVDA\\nvda.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files (x86)\\GeoGebra 5.0\\jre\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("qgis-bin.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\qgis-bin.exe"));
		this.listaDeProcessosAceitos.add(new Processo("python.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\python.exe"));
		this.listaDeProcessosAceitos.add(new Processo("designer.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\designer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("qgis-browser-bin.exe", "C:\\PROGRA~1\\QGIS2~1.18\\bin\\qgis-browser-bin.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Connect.Service.ContentService.exe",
				"C:\\Program Files\\Autodesk\\Content Service\\Connect.Service.ContentService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sftdde.exe",
				"C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftdde.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ArcMap.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("EXCEL.EXE", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("EXCEL.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\EXCEL.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("POWERPNT.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\POWERPNT.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("WINWORD.EXE", "C:\\Program Files\\Microsoft Office\\Office14\\WINWORD.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("w.exe", "C:\\Windows\\System32\\W.exe"));
		this.listaDeProcessosAceitos.add(new Processo("w.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("octave-gui.exe", "C:\\Octave\\Octave-4.2.0\\bin\\octave-gui.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AddInUtil.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v3.5\\addinutil.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ngen.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("mscorsvw.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\mscorsvw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ngen.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\ngen.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ngen.exe", "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\ngen.exe"));
		this.listaDeProcessosAceitos.add(new Processo("vstor_redist.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\vstor_redist.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Silverlight_x64.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\Silverlight_x64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("googleearth.exe",
				"C:\\Program Files (x86)\\Google\\Google Earth Pro\\client\\googleearth.exe"));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe", "C:\\Windows\\SysWOW64\\REG.exe"));
		this.listaDeProcessosAceitos.add(new Processo("JASP.exe", "C:\\Program Files\\JASP 0.8.0.1\\JASP.exe"));
		this.listaDeProcessosAceitos.add(new Processo("devcpp.exe", "C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("cpp.exe", "C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\bin\\cpp.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Rgui.exe", "C:\\Program Files\\R\\R-3.3.2\\bin\\x64\\Rgui.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Rgui.exe", "C:\\Program Files\\R\\R-3.3.2\\bin\\i386\\Rgui.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AdAppMgrSvc.exe",
				"C:\\Program Files (x86)\\Common Files\\Autodesk Shared\\AppManager\\R1\\AdAppMgrSvc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("LMU.exe", "C:\\Program Files\\Common Files\\Autodesk Shared\\Adlm\\R11\\LMU.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "C:\\Users\\dtiusr\\Documents\\eclipse_java\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CVHSVC.EXE",
				"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Virtualization Handler\\CVHSVC.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORDC.EXE", "Q:\\140066.ptb\\Office14\\WINWORDC.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("OFFICEVIRT.EXE",
				"C:\\Program Files (x86)\\Common Files\\microsoft shared\\virtualization handler\\OfficeVirt.exe"));
		this.listaDeProcessosAceitos.add(new Processo("EXCELC.EXE", "Q:\\140066.ptb\\Office14\\EXCELC.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("PDS.EXE",
				"C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 8 Demonstration\\BIN\\PDS.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("netbeans.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("java.exe", "C:\\Program Files (x86)\\Java\\jdk1.7.0_71\\bin\\java.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("netbeans64.exe", "C:\\Program Files\\NetBeans 8.1\\bin\\netbeans64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CVH.EXE",
				"C:\\Program Files (x86)\\Common Files\\microsoft shared\\Virtualization Handler\\CVH.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("sftvsa.exe",
				"C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftvsa.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sftlist.exe",
				"C:\\Program Files (x86)\\Microsoft Application Virtualization Client\\sftlist.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("PPTVIEW.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\PPTVIEW.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("POWERPNT.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office15\\POWERPNT.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("zotero.exe", "C:\\Program Files (x86)\\Zotero Standalone\\zotero.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("netbeans.exe", "C:\\Program Files\\NetBeans 8.1\\bin\\netbeans.exe"));
		this.listaDeProcessosAceitos.add(new Processo("psppire.exe", "C:\\Program Files\\PSPP\\bin\\psppire.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files (x86)\\Java\\jdk1.8.0_73\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.29.5\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.29.5\\GoogleCrashHandler64.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("reader_sl.exe", "C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\Reader_sl.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "C:\\Users\\dtiusr\\Documents\\eclipse_php\\eclipse.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TGitCache.exe", "C:\\Program Files\\TortoiseGit\\bin\\TGitCache.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("pgadmin3.exe", "C:\\Program Files (x86)\\pgAdmin III\\1.18\\pgadmin3.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WinSCP.exe", "C:\\Program Files (x86)\\WinSCP\\WinSCP.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("sqlitebrowser.exe", "C:\\Program Files (x86)\\SqliteBrowser3\\bin\\sqlitebrowser.exe"));
		this.listaDeProcessosAceitos.add(new Processo("putty (4).exe", "C:\\Users\\dtiusr\\Downloads\\putty (4).exe"));
		this.listaDeProcessosAceitos.add(new Processo("SkypeC2CPNRSvc.exe",
				"C:\\Program Files (x86)\\Skype\\Toolbars\\PNRSvc\\SkypeC2CPNRSvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SkypeC2CAutoUpdateSvc.exe",
				"C:\\Program Files (x86)\\Skype\\Toolbars\\AutoUpdate\\SkypeC2CAutoUpdateSvc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("PrintIsolationHost.exe", "C:\\Windows\\system32\\PrintIsolationHost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WINWORD.EXE", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "C:\\Program Files (x86)\\eclipse_php\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("System Idle Process", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "C:\\Program Files (x86)\\LibreOffice 5\\program\\soffice.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "C:\\Program Files (x86)\\LibreOffice 5\\program\\soffice.bin"));
		this.listaDeProcessosAceitos.add(new Processo("acad.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("acad.exe", "C:\\Program Files\\Autodesk\\AutoCAD 2016\\acad.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FNPLicensingService64.exe",
				"C:\\Program Files\\Common Files\\Macrovision Shared\\FLEXnet Publisher\\FNPLicensingService64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("antirun.exe", "C:\\Program Files (x86)\\Antirun\\antirun.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 5\\program\\soffice.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 5\\program\\soffice.bin"));
		this.listaDeProcessosAceitos
				.add(new Processo("scalc.exe", "C:\\Program Files\\LibreOffice 5\\program\\scalc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("swriter.exe", "C:\\Program Files\\LibreOffice 5\\program\\swriter.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("simpress.exe", "C:\\Program Files\\LibreOffice 5\\program\\simpress.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("codeblocks.exe", "C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("CbLauncher.exe", "C:\\Program Files (x86)\\CodeBlocks\\CbLauncher.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("mingw32-gcc.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-gcc.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("mingw32-g++.exe", "C:\\Program Files (x86)\\CodeBlocks\\MinGW\\bin\\mingw32-g++.exe"));
		this.listaDeProcessosAceitos.add(new Processo("as.exe",
				"C:\\Program Files (x86)\\CodeBlocks\\MinGWin\\..\\lib\\gcc\\mingw32\\4.9.2\\..\\..\\..\\..\\mingw32\\bin\\as.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("cb_console_runner.exe", "C:\\Program Files (x86)\\CodeBlocks\\cb_console_runner.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cc1.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("MSOHTMED.EXE", ""));
		this.listaDeProcessosAceitos.add(new Processo("Foxit Reader.exe",
				"C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\Foxit Reader.exe"));
		this.listaDeProcessosAceitos.add(new Processo("System", ""));
		this.listaDeProcessosAceitos.add(new Processo("smss.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe", "C:\\Windows\\system32\\csrss.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe", "C:\\Windows\\system32\\wininit.exe"));
		this.listaDeProcessosAceitos.add(new Processo("services.exe", "C:\\Windows\\system32\\services.exe"));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe", "C:\\Windows\\system32\\winlogon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe", "C:\\Windows\\system32\\lsass.exe"));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe", "C:\\Windows\\system32\\lsm.exe"));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe", "C:\\Windows\\system32\\svchost.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("MsMpEng.exe", "c:\\Program Files\\Microsoft Security Client\\MsMpEng.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TrustedInstaller.exe", "C:\\Windows\\servicing\\TrustedInstaller.exe"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe", "C:\\Windows\\System32\\spoolsv.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TdmService.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Trusted Drive Manager\\TdmService.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("armsvc.exe", "C:\\Program Files (x86)\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("EmbassyServer.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\EMBASSY Client Core\\EmbassyServer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FCUpdateService.exe",
				"C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\Foxit Cloud\\FCUpdateService.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("HeciServer.exe", "C:\\Program Files\\Intel\\iCLS Client\\HeciServer.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("IPROSetMonitor.exe", "C:\\Windows\\system32\\IProsetMonitor.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IpOverUsbSvc.exe",
				"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Phone Tools\\CoreCon\\11.0\\bin\\IpOverUsbSvc.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("LMIGuardianSvc.exe", "C:\\Program Files (x86)\\LogMeIn Hamachi\\LMIGuardianSvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("pbadrvsvc.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\hapi64\\pbadrvsvc.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("sqlwriter.exe", "C:\\Program Files\\Microsoft SQL Server\\90\\Shared\\sqlwriter.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe",
				"C:\\Program Files (x86)\\TeamViewer\\Version9\\TeamViewer_Service.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("VisualSVNServer.exe", "C:\\Program Files\\VisualSVN Server\\bin\\VisualSVNServer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WaveAMService.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Authentication Manager\\WaveAMService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WLIDSVC.EXE",
				"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSVC.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("hamachi-2.exe", "C:\\Program Files (x86)\\LogMeIn Hamachi\\hamachi-2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WLIDSVCM.EXE",
				"C:\\Program Files\\Common Files\\Microsoft Shared\\Windows Live\\WLIDSvcM.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe", "C:\\Windows\\system32\\wbem\\wmiprvse.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("NisSrv.exe", "c:\\Program Files\\Microsoft Security Client\\NisSrv.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("upeksvr.exe", "C:\\Program Files\\Common Files\\SPBA\\upeksvr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe", "C:\\Windows\\system32\\taskhost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("dwm.exe", "C:\\Windows\\system32\\Dwm.exe"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe", "C:\\Windows\\Explorer.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.26.9\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.26.9\\GoogleCrashHandler64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SearchIndexer.exe", "C:\\Windows\\system32\\SearchIndexer.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("RtDCpl64.exe", "C:\\Program Files\\Realtek\\Audio\\HDA\\RtDCpl64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TdmNotify.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\Trusted Drive Manager\\TdmNotify.exe"));
		this.listaDeProcessosAceitos.add(new Processo("igfxtray.exe", "C:\\Windows\\System32\\igfxtray.exe"));
		this.listaDeProcessosAceitos.add(new Processo("hkcmd.exe", "C:\\Windows\\System32\\hkcmd.exe"));
		this.listaDeProcessosAceitos.add(new Processo("igfxpers.exe", "C:\\Windows\\System32\\igfxpers.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("msseces.exe", "C:\\Program Files\\Microsoft Security Client\\msseces.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("OcsSystray.exe", "C:\\Program Files (x86)\\OCS Inventory Agent\\OcsSystray.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ICCProxy.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Integrated Clock Controller Service\\ICCProxy.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("OcsService.exe", "C:\\Program Files (x86)\\OCS Inventory Agent\\OcsService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorDataMgrSvc.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("jhi_service.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL\\jhi_service.exe"));
		this.listaDeProcessosAceitos.add(new Processo("LMS.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\LMS\\LMS.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("chrome.exe", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe", "C:\\Windows\\system32\\conhost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe", "C:\\Windows\\system32\\notepad.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wampmanager.exe", "C:\\wamp\\wampmanager.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("httpd.exe", "c:\\wamp\\bin\\apache\\apache2.4.9\\bin\\httpd.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("mysqld.exe", "c:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqld.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("scalc.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\scalc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\soffice.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "C:\\Program Files (x86)\\LibreOffice 4\\program\\soffice.bin"));
		this.listaDeProcessosAceitos.add(new Processo("audiodg.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("WINWORD.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office15\\WINWORD.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("EXCEL.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office15\\EXCEL.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("notepad++.exe", "C:\\Program Files (x86)\\Notepad++\\notepad++.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mspaint.exe", "C:\\Windows\\system32\\mspaint.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("firefox.exe", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("iexplore.exe", "C:\\Program Files\\Internet Explorer\\iexplore.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("iexplore.exe", "C:\\Program Files (x86)\\Internet Explorer\\IEXPLORE.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerPlugin_16_0_0_305.exe",
				"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_16_0_0_305.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FlashUtil64_16_0_0_305_ActiveX.exe",
				"C:\\Windows\\system32\\Macromed\\Flash\\FlashUtil64_16_0_0_305_ActiveX.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WinRAR.exe", "C:\\Program Files\\WinRAR\\WinRAR.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wmplayer.exe", "C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("SearchProtocolHost.exe", "C:\\Windows\\system32\\SearchProtocolHost.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("SearchFilterHost.exe", "C:\\Windows\\system32\\SearchFilterHost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe", "C:\\Windows\\System32\\Wbem\\wmic.exe"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe", "C:\\Windows\\system32\\igfxsrvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("UniCafeClient.exe", "C:\\unicafe\\UniCafeClient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("taskeng.exe", "C:\\Windows\\system32\\taskeng.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_31\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("tasklist.exe", "C:\\Windows\\system32\\tasklist.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe", "C:\\Windows\\System32\\WUDFHost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe", "C:\\Windows\\system32\\DllHost.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("UniCafeClient.exe", "C:\\Program Files (x86)\\UniCafe\\UniCafeCLient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sppsvc.exe", "C:\\Windows\\system32\\sppsvc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "C:\\arquivos\\jefponte\\Documents\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AAM Updates Notifier.exe",
				"C:\\Program Files (x86)\\Common Files\\Adobe\\OOBE\\PDApp\\UWA\\AAM Updates Notifier.exe"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\ProgramData\\Oracle\\Java\\javapath\\java.exe"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("Connect.Service.ContentService.exe",
				"C:\\Program Files (x86)\\Autodesk\\Content Service\\Connect.Service.ContentService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe", "C:\\Windows\\SysWOW64\\Wbem\\wmic.exe"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe", "C:\\Windows\\System32\\rundll32.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wmpnetwk.exe", "C:\\Program Files\\Windows Media Player\\wmpnetwk.exe"));
		this.listaDeProcessosAceitos.add(new Processo("explorer.exe", "C:\\Windows\\SysWOW64\\explorer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre7\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("taskkill.exe", "C:\\Windows\\SysWOW64\\taskkill.exe"));
		this.listaDeProcessosAceitos.add(new Processo("gbpsv.exe", "C:\\PROGRA~2\\GbPlugin\\GbpSv.exe"));
		this.listaDeProcessosAceitos.add(new Processo("csrss.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("wininit.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("services.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("lsass.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("armsvc.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("lsm.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TabTip.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("WLIDSVCM.EXE", ""));
		this.listaDeProcessosAceitos.add(new Processo("wisptis.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("Connect.Service.ContentService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("svchost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("taskkill.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TrustedInstaller.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("oracle.exe", "c:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\bin\\ORACLE.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("spoolsv.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("OcsService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("WaveAMService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("LMS.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("gbpsv.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("jhi_service.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TdmService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("winlogon.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("IAStorDataMgrSvc.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("taskeng.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("MsMpEng.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("pbadrvsvc.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("sppsvc.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("consent.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("igfxCUIService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TabTip32.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("WLIDSVC.EXE", ""));
		this.listaDeProcessosAceitos.add(
				new Processo("TNSLSNR.EXE", "C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\BIN\\tnslsnr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("EmbassyServer.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("HeciServer.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("IPROSetMonitor.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("oracle.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TNSLSNR.EXE", ""));
		this.listaDeProcessosAceitos.add(new Processo("StkCSrv.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("NisSrv.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("upeksvr.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("PresentationFontCache.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("taskhost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("AcroRd32.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("mmc.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("igfxCUIService.exe", "C:\\Windows\\system32\\igfxCUIService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("PresentationFontCache.exe",
				"C:\\Windows\\Microsoft.Net\\Framework64\\v3.0\\WPF\\PresentationFontCache.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wisptis.exe", "C:\\Windows\\SYSTEM32\\WISPTIS.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("conhost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("dllhost.exe", "C:\\Windows\\SysWOW64\\DllHost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mmc.exe", "C:\\Windows\\system32\\mmc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WUDFHost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("WeatherService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("UpdatePlatform.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe", "C:\\Windows\\system32\\wuauclt.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ArcGISAdmin.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("FNPLicensingService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("splwow64.exe", "C:\\Windows\\splwow64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OSPPSVC.EXE", ""));
		this.listaDeProcessosAceitos.add(new Processo("python.exe", "C:\\Python27\\python.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_45\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("acad.exe", "C:\\Program Files\\Autodesk\\AutoCAD 2013\\acad.exe"));
		this.listaDeProcessosAceitos.add(new Processo("VSSVC.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("ArcMap.exe", "C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcMap.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ArcGISCacheMgr.exe",
				"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISCacheMgr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ArcGISConnection.exe",
				"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISConnection.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AppROT.ex", "C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\AppROT.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wsceaa.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("ESRIReporter.exe",
				"C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ESRIReporter.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AppROT.exe", "C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\AppROT.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ArcGlobe.exe", "C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcGlobe.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ArcScene.exe", "C:\\Program Files (x86)\\ArcGIS\\Desktop10.1\\bin\\ArcScene.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Inventor Fusion.exe",
				"C:\\Program Files\\Autodesk\\Inventor Fusion 2013\\Inventor Fusion.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CloudOPTClient.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("SketchBookDesigner.exe",
				"C:\\Program Files\\Autodesk\\SketchBookDesigner2013\\bin\\SketchBookDesigner.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WSCommCntr4.exe",
				"C:\\Program Files\\Common Files\\Autodesk Shared\\WSCommCntr4\\lib\\WSCommCntr4.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AcBrowserHost.exe",
				"C:\\Program Files\\Autodesk\\AutoCAD 2013\\AdExchange\\AcBrowserHost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SBStartup.exe",
				"C:\\Program Files\\Autodesk\\SketchBookDesigner2013\\bin\\SBStartup.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("blender.exe", "C:\\Program Files (x86)\\Blender Foundation\\Blender\\blender.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SketchUp.exe", ""));
		this.listaDeProcessosAceitos.add(
				new Processo("mpc-hc64.exe", "C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC64\\mpc-hc64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WMIC.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("setup_wm.exe", "C:\\Program Files (x86)\\Windows Media Player\\setup_wm.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("mpc-hc.exe", "C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC\\mpc-hc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("setup_wm.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("unregmp2.exe", "C:\\Windows\\system32\\unregmp2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.bin", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("sbase.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\sbase.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("simpress.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\simpress.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("smath.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\smath.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("swriter.exe", "C:\\Program Files (x86)\\LibreOffice 4\\program\\swriter.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Welcome.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Welcome.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Notebook.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Notebook.exe"));
		this.listaDeProcessosAceitos.add(new Processo("recorder.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\recorder.exe"));
		this.listaDeProcessosAceitos.add(new Processo("VideoPlayer.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\VideoPlayer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("snapshot.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\snapshot.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Spotlight.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\Spotlight.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WindowsMagnifier.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\WindowsMagnifier.exe"));
		this.listaDeProcessosAceitos.add(new Processo("PointerTool.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Notebook\\PointerTool.exe"));
		this.listaDeProcessosAceitos.add(new Processo("UCGui.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\UCGui.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SMARTBoardTools.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBoardTools.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Orient.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Orient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SMARTBrd.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBrd.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OnScreenKeyboard.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\OnScreenKeyboard.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Aware.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Aware.exe"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe", "C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("xampp-control.exe", "C:\\xampp\\xampp-control.exe"));
		this.listaDeProcessosAceitos.add(new Processo("calc.exe", "C:\\Windows\\system32\\calc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WLXPhotoGallery.exe",
				"C:\\Program Files (x86)\\Windows Live\\Photo Gallery\\WLXPhotoGallery.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("MovieMaker.exe", "C:\\Program Files (x86)\\Windows Live\\Photo Gallery\\MovieMaker.exe"));
		this.listaDeProcessosAceitos.add(new Processo("StkCSrv.exe", "C:\\Windows\\System32\\StkCSrv.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TabTip.exe", "C:\\Program Files\\Common Files\\microsoft shared\\ink\\TabTip.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("TeamViewer_Service.exe", "C:\\Program Files (x86)\\TeamViewer\\TeamViewer_Service.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TabTip32.exe",
				"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\Ink\\TabTip32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("StikyNot.exe", "C:\\Windows\\system32\\StikyNot.exe"));
		this.listaDeProcessosAceitos.add(new Processo("guimain.exe", "C:\\MinGW\\libexec\\mingw-get\\guimain.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wordpad.exe", "C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wlstartup.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("firefox.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("plugin-container.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerPlugin_17_0_0_188.exe",
				"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_17_0_0_188.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AcroRd32.exe", "C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("blender.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("googleearth.exe",
				"C:\\Program Files (x86)\\Google\\Google Earth\\client\\googleearth.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("EXCEL.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\EXCEL.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("ONENOTE.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\ONENOTE.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe", "C:\\Windows\\SysWOW64\\msiexec.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("POWERPNT.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\POWERPNT.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("WINWORD.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("Silverlight.Configuration.exe",
				"C:\\Program Files (x86)\\Microsoft Silverlight\\5.1.40416.0\\Silverlight.Configuration.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Marker.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\Marker.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OSPPSVC.EXE",
				"C:\\Program Files\\Common Files\\Microsoft Shared\\OfficeSoftwareProtectionPlatform\\OSPPSVC.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("FlashMediaLiveEncoder.exe",
				"C:\\Program Files (x86)\\Adobe\\Flash Media Live Encoder 3.2\\FlashMediaLiveEncoder.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FNPLicensingService.exe",
				"C:\\Program Files (x86)\\Common Files\\Macrovision Shared\\FLEXnet Publisher\\FNPLicensingService.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("ArcGISAdmin.exe", "C:\\Program Files (x86)\\Common Files\\ArcGIS\\bin\\ArcGISAdmin.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SketchBookDesigner.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("Dropbox.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("gtm.exe", "C:\\Program Files (x86)\\GTMPRO\\gtm.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("SketchUp.exe", "C:\\Program Files (x86)\\Google\\Google SketchUp 8\\SketchUp.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("PDFCreator.exe", "C:\\Program Files\\PDFCreator\\PDFCreator.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("gswin32c.exe", "C:\\Program Files\\PDFCreator\\Ghostscript\\Bin\\gswin32c.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wsceaa.exe",
				"C:\\Program Files\\Dell\\Dell Data Protection\\Access\\Advanced\\Wave\\RemoteManagement\\WSCEAA.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("MpCmdRun.exe", "C:\\Program Files\\Microsoft Security Client\\MpCmdRun.exe"));
		this.listaDeProcessosAceitos.add(new Processo("soffice.exe", ""));
		this.listaDeProcessosAceitos.add(
				new Processo("UpdatePlatform.exe", "C:\\Program Files (x86)\\ToolsUpdatePlatform\\UpdatePlatform.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wlstartup.exe", "C:\\Program Files (x86)\\Windows Live\\Installer\\wlstartup.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FlashUtil64_17_0_0_188_ActiveX.exe",
				"C:\\Windows\\system32\\Macromed\\Flash\\FlashUtil64_17_0_0_188_ActiveX.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CloudOPTClient.exe",
				"C:\\Program Files (x86)\\WeatherTool\\1.2.2.10180\\CloudOPTClient\\CloudOPTClient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("consent.exe", "C:\\Windows\\system32\\consent.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("GoogleUpdate.exe", "C:\\Program Files (x86)\\Google\\Update\\GoogleUpdate.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GfxUI.exe", "C:\\Windows\\System32\\GfxUI.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GfxUI.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("igfxEM.exe", "C:\\Windows\\system32\\igfxEM.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cvtres.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("GoogleUpdate.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("igfxHK.exe", "C:\\Windows\\system32\\igfxHK.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Updater.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("InputPersonalization.exe",
				"C:\\Program Files\\Common Files\\Microsoft Shared\\Ink\\InputPersonalization.exe"));
		this.listaDeProcessosAceitos.add(new Processo("igfxTray.exe", "C:\\Windows\\system32\\igfxTray.exe"));
		this.listaDeProcessosAceitos.add(new Processo("iusb3mon.exe,iusb3mon.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) USB 3.0 eXtensible Host Controller Driver\\Application\\iusb3mon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SMARTCrashHelper.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTCrashHelper.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SndVol.exe", "C:\\Windows\\system32\\SndVol.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ONENOTEM.EXE", "C:\\Program Files (x86)\\Microsoft Office\\Office14\\ONENOTEM.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("iusb3mon.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) USB 3.0 eXtensible Host Controller Driver\\Application\\iusb3mon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe", "C:\\Windows\\SysWOW64\\cmd.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("OCSInventory.exe", "C:\\Program Files (x86)\\OCS Inventory Agent\\OCSInventory.exe"));
		this.listaDeProcessosAceitos.add(new Processo("LogonUI.exe", "C:\\Windows\\system32\\LogonUI.exe"));
		this.listaDeProcessosAceitos.add(new Processo("VSSVC.exe", "C:\\Windows\\system32\\vssvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wmplayer.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("mcbuilder.exe", "C:\\Windows\\system32\\mcbuilder.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Defrag.exe", "C:\\Windows\\system32\\defrag.exe"));
		this.listaDeProcessosAceitos.add(new Processo("aitagent.exe", "C:\\Windows\\system32\\aitagent.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("unregmp2.exe", "C:\\Windows\\SysWOW64\\unregmp2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WMIADAP.exe", "C:\\Windows\\system32\\wbem\\WMIADAP.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("taskkill.exe", "C:\\Windows\\system32\\taskkill.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SMARTBoardService.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTBoardService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SMARTSNMPAgent.exe",
				"C:\\Program Files (x86)\\SMART Technologies\\SMART Product Drivers\\SMARTSNMPAgent.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("jusched.exe", "C:\\Program Files (x86)\\Common Files\\Java\\Java Update\\jusched.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorIcon.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("PrivacyIconClient.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IMSS\\PrivacyIconClient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WerFault.exe", "C:\\Windows\\SysWOW64\\WerFault.exe"));
		this.listaDeProcessosAceitos.add(new Processo("PIconStartup.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IMSS\\PIconStartup.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Dxpserver.exe", "C:\\Windows\\system32\\DXPServer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("DeviceDisplayObjectProvider.exe",
				"C:\\Windows\\system32\\DeviceDisplayObjectProvider.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorIconLaunch.exe",
				"C:\\Program Files (x86)\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIconLaunch.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("USBGuard.exe", "C:\\Program Files (x86)\\USB Disk Security\\USBGuard.exe"));
		this.listaDeProcessosAceitos.add(new Processo("MotoHelperAgent.exe",
				"C:\\Program Files (x86)\\Motorola Mobility\\Motorola Device Manager\\MotoHelperAgent.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ForwardDaemon.exe",
				"C:\\Program Files (x86)\\Motorola\\MotForwardDaemon\\ForwardDaemon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("MotoHelperService.exe",
				"C:\\Program Files (x86)\\Motorola Mobility\\Motorola Device Manager\\MotoHelperService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe", "C:\\Windows\\system32\\msiexec.exe"));
		this.listaDeProcessosAceitos.add(new Processo("reg.exe", "C:\\Windows\\system32\\REG.exe"));
		this.listaDeProcessosAceitos.add(new Processo("msdtc.exe", "C:\\Windows\\System32\\msdtc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe", "C:\\Windows\\SysWOW64\\rundll32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("net.exe", "C:\\Windows\\system32\\net.exe"));
		this.listaDeProcessosAceitos.add(new Processo("net1.exe", "C:\\Windows\\system32\\net1.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("CmapTools.exe", "C:\\Program Files\\IHMC CmapTools\\bin\\CmapTools.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\IHMC CmapTools\\jre\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Winx64CmapTools_v6.01_02-25-15.exe",
				"\\\\LABTI36\\arquivos\\acleber\\Downloads\\Winx64CmapTools_v6.01_02-25-15.exe"));
		this.listaDeProcessosAceitos.add(new Processo("dinotify.exe", "C:\\Windows\\System32\\dinotify.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("WMIADAP.exe", "\\\\?\\C:\\Windows\\system32\\wbem\\WMIADAP.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("AcroRd32.exe",
				"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("RdrCEF.exe",
				"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroCEF\\RdrCEF.exe"));
		this.listaDeProcessosAceitos.add(new Processo("LogTransport2.exe",
				"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\LogTransport2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CCleaner64.exe", "C:\\Program Files\\CCleaner\\CCleaner64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\Program Files (x86)\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("MpSigStub.exe", "C:\\Windows\\system32\\MpSigStub.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sdclt.exe", "C:\\Windows\\System32\\sdclt.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "E:\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files (x86)\\Java\\jre1.8.0_40\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("lmgrd.exe", "C:\\Program Files (x86)\\ArcGIS\\License10.1\\bin\\lmgrd.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("ARCGIS.exe", "C:\\Program Files (x86)\\ArcGIS\\License10.1\\bin\\ARCGIS.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("sched.exe", "C:\\Program Files (x86)\\Avira\\Antivirus\\sched.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("avguard.exe", "C:\\Program Files (x86)\\Avira\\Antivirus\\avguard.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("avgnt.exe", "C:\\Program Files (x86)\\Avira\\Antivirus\\avgnt.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("avshadow.exe", "C:\\Program Files (x86)\\Avira\\Antivirus\\avshadow.exe"));
		this.listaDeProcessosAceitos.add(new Processo("net.exe", "C:\\Windows\\SysWOW64\\net.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("AdobeARM.exe", "C:\\Program Files (x86)\\Common Files\\Adobe\\ARM\\1.0\\AdobeARM.exe"));
		this.listaDeProcessosAceitos.add(new Processo("reader_sl.exe",
				"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\Reader_sl.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("googledrivesync.exe", "C:\\Program Files (x86)\\Google\\Drive\\googledrivesync.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WmiPrvSE.exe", "C:\\Windows\\sysWOW64\\wbem\\wmiprvse.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_40\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("eclipse.exe", "C:\\Program Files (x86)\\eclipse_c\\eclipse.exe"));
		this.listaDeProcessosAceitos.add(new Processo("starter.exe",
				"C:\\Program Files (x86)\\eclipse_c\\plugins\\org.eclipse.cdt.core.win32.x86_64_5.3.0.201409172108\\os\\win32\\x86_64\\starter.exe"));
		this.listaDeProcessosAceitos.add(new Processo("gcc.exe", "C:\\MinGW\\bin\\gcc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cacls.exe", "C:\\Windows\\system32\\cacls.exe"));
		this.listaDeProcessosAceitos.add(new Processo("drvinst.exe", "C:\\Windows\\system32\\DrvInst.exe"));
		this.listaDeProcessosAceitos.add(new Processo("makecab.exe", "C:\\Windows\\system32\\makecab.exe"));
		this.listaDeProcessosAceitos.add(new Processo("attrib.exe", "C:\\Windows\\system32\\attrib.exe"));
		this.listaDeProcessosAceitos.add(new Processo("notepad.exe", "C:\\Windows\\SysWOW64\\notepad.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TdmService.exe",
				"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmService.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("armsvc.exe", "C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\armsvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe",
				"C:\\Program Files\\TeamViewer\\Version8\\TeamViewer_Service.exe"));
		this.listaDeProcessosAceitos.add(new Processo("unsecapp.exe", "C:\\Windows\\system32\\wbem\\unsecapp.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("OcsService.exe", "C:\\Program Files\\OCS Inventory Agent\\OcsService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorDataMgrSvc.exe",
				"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorDataMgrSvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("lms.exe", "C:\\Program Files\\Intel\\AMT\\LMS.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("UNS.exe", "C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\UNS\\UNS.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("smax4pnp.exe", "C:\\Program Files\\Analog Devices\\Core\\smax4pnp.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorIcon.exe",
				"C:\\Program Files\\Intel\\Intel(R) Rapid Storage Technology\\IAStorIcon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WavXDocMgr.exe",
				"C:\\Program Files\\Wave Systems Corp\\Services Manager\\DocMgr\\bin\\WavXDocMgr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("BcmDeviceAndTaskStatusService.exe",
				"C:\\Program Files\\Dell\\Dell ControlPoint\\Security Manager\\BcmDeviceAndTaskStatusService.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("PDVDDXSrv.exe", "C:\\Program Files\\CyberLink\\PowerDVD DX\\PDVDDXSrv.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wmdc.exe", "C:\\Windows\\WindowsMobile\\wmdc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("OcsSystray.exe", "C:\\Program Files\\OCS Inventory Agent\\OcsSystray.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TdmNotify.exe",
				"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TdmNotify.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "C:\\Program Files\\BrOffice.org 3\\program\\soffice.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "C:\\Program Files\\BrOffice.org 3\\program\\soffice.bin"));
		this.listaDeProcessosAceitos.add(new Processo("PrivacyIconClient.exe",
				"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PrivacyIconClient.exe"));
		this.listaDeProcessosAceitos.add(new Processo("eclipse.exe", "C:\\Program Files\\eclipse\\eclipse.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("SeaPort.EXE", "C:\\Program Files\\Microsoft\\BingBar\\7.3.132.0\\SeaPort.exe"));
		this.listaDeProcessosAceitos.add(new Processo("cmd.exe", "C:\\Windows\\system32\\cmd.exe"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\Windows\\system32\\java.exe"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\Program Files\\Java\\jre7\\bin\\java.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("smath.exe", "C:\\Program Files\\BrOffice.org 3\\program\\smath.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("java.exe", "C:\\Program Files\\Java\\jdk1.6.0_21\\bin\\java.exe"));
		this.listaDeProcessosAceitos.add(new Processo("java.exe", "C:\\Program Files\\Java\\jre6\\bin\\java.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("chrome.exe", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"));
		this.listaDeProcessosAceitos.add(new Processo("ISIS.EXE",
				"C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 7 Professional\\BIN\\ISIS.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("UniCafe.scr",
				"C:\\projetos\\unicafe\\projeto\\unicafeWin\\unicafe\\src\\main\\resources\\images\\UniCafe.scr"));
		this.listaDeProcessosAceitos.add(new Processo("antirun.exe", "C:\\Program Files\\Antirun\\antirun.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AdobeARM.exe", "C:\\Program Files\\Common Files\\Adobe\\ARM\\1.0\\AdobeARM.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AddInUtil.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v3.5\\addinutil.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.201.2218.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.2218.0.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.203.205.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.203.205.0.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.201.2067.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.2067.0.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.201.1937.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.201.1937.0.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("AcroRd32.exe", "C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("AM_Base_Patch1.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Base_Patch1.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("AM_Delta.exe", "C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("CompatTelRunner.exe", "C:\\Windows\\system32\\CompatTelRunner.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("csc.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v2.0.50727\\csc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("chrmstp.exe",
				"C:\\Program Files\\Google\\Chrome\\Application\\43.0.2357.134\\Installer\\chrmstp.exe"));
		this.listaDeProcessosAceitos.add(new Processo("DFLocker.exe", "C:\\Windows\\TEMP\\DFLocker.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("diagtrackrunner.exe", "C:\\Windows\\system32\\compattel\\DiagTrackRunner.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("firefox.exe", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
		this.listaDeProcessosAceitos.add(new Processo("gpscript.exe", "C:\\Windows\\system32\\gpscript.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("GWXConfigManager.exe", "C:\\Windows\\system32\\GWX\\GWXConfigManager.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("GoogleUpdate.exe", "C:\\Program Files\\Google\\Update\\GoogleUpdate.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GWX.exe", "C:\\Windows\\system32\\GWX\\GWX.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files\\Google\\Update\\1.3.28.1\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("jusched.exe", "C:\\Program Files\\Common Files\\Java\\Java Update\\jusched.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("jp2launcher.exe", "C:\\Program Files\\Java\\jre7\\bin\\jp2launcher.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mobsync.exe", "C:\\Windows\\System32\\mobsync.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("msoia.exe", "C:\\Program Files\\Microsoft Office\\Office15\\msoia.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("mscorsvw.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\mscorsvw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-fc777bc9.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-fc777bc9.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-4c2ad6cf.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-4c2ad6cf.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-943bc045.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-943bc045.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-c4773883.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-c4773883.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-7c4cdcc4.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-7c4cdcc4.exe"));
		this.listaDeProcessosAceitos.add(new Processo("MPSigStub.exe", "c:\\59a0b9075bdf5a428ed9\\MpSigStub.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OLicenseHeartbeat.exe",
				"C:\\Program Files\\Common Files\\Microsoft Shared\\Office15\\OLicenseHeartbeat.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("OCSInventory.exe", "C:\\Program Files\\OCS Inventory Agent\\OCSInventory.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OCS-NG-Windows-Agent-Setup.exe",
				"\\\\net.unilab.edu.br\\SysVol\\net.unilab.edu.br\\Policies\\{2A4896A8-6128-47A7-A2DB-32577BE2EDA9}\\Machine\\Scripts\\Startup\\OCS-NG-Windows-Agent-Setup.exe"));
		this.listaDeProcessosAceitos.add(new Processo("PIconStartup.exe",
				"C:\\Program Files\\Common Files\\Intel\\Privacy Icon\\PIconStartup.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("reader_sl.exe", "C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\Reader_sl.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sc.exe", "C:\\Windows\\system32\\sc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("sdiagnhost.exe", "C:\\Windows\\System32\\sdiagnhost.exe"));
		this.listaDeProcessosAceitos.add(new Processo("TDMAuditLogger.exe",
				"C:\\Program Files\\Wave Systems Corp\\Trusted Drive Manager\\TDMAuditLogger.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("VCDDaemon.exe", "C:\\Program Files\\Elaborate Bytes\\VirtualCloneDrive\\VCDDaemon.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wsqmcons.exe", "C:\\Windows\\System32\\wsqmcons.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wermgr.exe", "C:\\Windows\\system32\\wermgr.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wicainventory.exe", "C:\\Windows\\system32\\CompatTel\\WicaInventory.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("WatAdminSvc.exe", "C:\\Windows\\system32\\Wat\\WatAdminSvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("WerFault.exe", "C:\\Windows\\system32\\WerFault.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("POWERPNT.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\POWERPNT.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("WINWORD.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("UI0Detect.exe", "C:\\Windows\\system32\\UI0Detect.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jre1.8.0_51\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("setup_wm.exe", "C:\\Program Files\\Windows Media Player\\setup_wm.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("setup_wm.exe", "C:\\Program\\Files\\Windows Media Player\\setup_wm.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Eula.exe", "C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\Eula.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("helper.exe", "C:\\Program Files\\Mozilla Firefox\\uninstall\\helper.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("plugin-container.exe", "C:\\Program Files\\Mozilla Firefox\\plugin-container.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerPlugin_18_0_0_209.exe",
				"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerPlugin_18_0_0_209.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("dfsvc.exe", "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\dfsvc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("mpc-hc.exe", "C:\\Program Files\\K-Lite Codec Pack\\MPC-HC\\mpc-hc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("sbase.exe", "C:\\Program Files\\LibreOffice 4\\program\\sbase.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.exe", "C:\\Program Files\\LibreOffice 4\\program\\soffice.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("soffice.bin", "C:\\Program Files\\LibreOffice 4\\program\\soffice.bin"));
		this.listaDeProcessosAceitos
				.add(new Processo("scalc.exe", "C:\\Program Files\\LibreOffice 4\\program\\scalc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("sdraw.exe", "C:\\Program Files\\LibreOffice 4\\program\\sdraw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("simpress.exe", "C:\\Program Files\\LibreOffice 4\\program\\simpress.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("smath.exe", "C:\\Program Files\\LibreOffice 4\\program\\smath.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("swriter.exe", "C:\\Program Files\\LibreOffice 4\\program\\swriter.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("MSACCESS.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\MSACCESS.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("EXCEL.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\EXCEL.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("INFOPATH.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\INFOPATH.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("GROOVE.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\GROOVE.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("ONENOTE.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\ONENOTE.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("OUTLOOK.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\OUTLOOK.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("FIRSTRUN.EXE", "C:\\Program Files\\Microsoft Office\\Office15\\FIRSTRUN.EXE"));
		this.listaDeProcessosAceitos.add(
				new Processo("MSOSQM.EXE", "C:\\Program Files\\Common Files\\Microsoft Shared\\Office15\\msosqm.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("lync.exe", "C:\\Program Files\\Microsoft Office\\Office15\\lync.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Silverlight.Configuration.exe",
				"C:\\Program Files\\Microsoft Silverlight\\5.1.40416.0\\Silverlight.Configuration.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Skype.exe", "C:\\Program Files\\Skype\\Phone\\Skype.exe"));
		this.listaDeProcessosAceitos.add(new Processo("vlc.exe", "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TeamViewer.exe", "C:\\Program Files\\TeamViewer\\Version9\\TeamViewer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("unregmp2.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("wmplayer.exe", "C:\\Program Files\\Windows Media Player\\wmplayer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SearchFilterHost.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("msiexec.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("AcroRd32.exe", "C:\\Program Files\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("net1.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("TeamViewer_Service.exe",
				"C:\\Program Files\\TeamViewer\\Version9\\TeamViewer_Service.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jdk1.8.0_73\\jre\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("java.exe", "C:\\Program Files\\Java\\jdk1.8.0_73\\jre\\bin\\java.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OCSInventory.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerUpdateService.exe",
				"C:\\Windows\\system32\\Macromed\\Flash\\FlashPlayerUpdateService.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mobsync.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("chrome.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("cmd", ""));
		this.listaDeProcessosAceitos.add(
				new Processo("jucheck.exe", "C:\\Program Files (x86)\\Common Files\\Java\\Java Update\\jucheck.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.28.1\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.28.1\\GoogleCrashHandler64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerPlugin_13_0_0_214.exe",
				"C:\\Windows\\SysWOW64\\Macromed\\Flash\\FlashPlayerPlugin_13_0_0_214.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FlashPlayerUpdateService.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("chrmstp.exe",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\44.0.2403.130\\Installer\\chrmstp.exe"));
		this.listaDeProcessosAceitos.add(new Processo("OIS.EXE", "C:\\PROGRA~2\\MICROS~2\\Office14\\OIS.EXE"));
		this.listaDeProcessosAceitos.add(new Processo("software_reporter_tool.exe",
				"C:\\localunicafe\\irlandia\\local\\Google\\Chrome\\User Data\\SwReporter\\4.28.1\\software_reporter_tool.exe"));
		this.listaDeProcessosAceitos.add(new Processo("igfxsrvc.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("LiveUpdate.exe", "C:\\Program Files (x86)\\IObit\\LiveUpdate\\LiveUpdate.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("IObitLauncher.exe", "C:\\Program Files (x86)\\IObit\\LiveUpdate\\IObitLauncher.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Updater.exe", "C:\\Program Files (x86)\\Skype\\Updater\\Updater.exe"));
		this.listaDeProcessosAceitos.add(new Processo("IAStorIcon.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("OCS-NG-Windows-Agent-Setup.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("rundll32.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("wicainventory.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.203.1791.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.203.1791.0.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-a6cbaad3.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-a6cbaad3.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-8733523d.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-8733523d.exe"));
		this.listaDeProcessosAceitos.add(new Processo("core.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("javaw.exe", "C:\\Windows\\system32\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("wuauclt.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("studio64.exe", "C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("fsnotifier64.exe", "C:\\Program Files\\Android\\Android Studio\\bin\\fsnotifier64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("jucheck.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("java.exe", "C:\\Program Files\\Android\\Android Studio\\jre\\bin\\java.exe"));
		this.listaDeProcessosAceitos.add(new Processo("BizagiModeler.exe",
				"C:\\Program Files\\Bizagi\\Bizagi Modeler\\Modeler\\BizagiModeler.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("wsffcmgr.exe", "C:\\Program Files\\Diebold\\Warsaw\\wsffcmgr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("core.exe", "C:\\Program Files\\Diebold\\Warsaw\\core.exe"));
		this.listaDeProcessosAceitos.add(new Processo("Name", "ExecutablePath"));
		this.listaDeProcessosAceitos.add(new Processo("CefSharp.BrowserSubprocess.exe",
				"C:\\Program Files\\Bizagi\\Bizagi Modeler\\Modeler\\CefSharp.BrowserSubprocess.exe"));
		this.listaDeProcessosAceitos.add(
				new Processo("mingw32-make.exe", "C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\bin\\mingw32-make.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TortoiseGitProc.exe", "C:\\Program Files\\TortoiseGit\\bin\\TortoiseGitProc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TeamViewer.exe", "C:\\Program Files (x86)\\TeamViewer\\TeamViewer.exe"));
		this.listaDeProcessosAceitos.add(new Processo("tv_w32.exe", "C:\\Program Files (x86)\\TeamViewer\\tv_w32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("tv_x64.exe", "C:\\Program Files (x86)\\TeamViewer\\tv_x64.exe"));
		this.listaDeProcessosAceitos.add(new Processo("taskmgr.exe", "C:\\Windows\\system32\\taskmgr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CS6ServiceManager.exe",
				"C:\\Program Files (x86)\\Common Files\\Adobe\\CS6ServiceManager\\CS6ServiceManager.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("TortoiseGitMerge.exe", "C:\\Program Files\\TortoiseGit\\bin\\TortoiseGitMerge.exe"));
		this.listaDeProcessosAceitos.add(new Processo("regedit.exe", "C:\\Windows\\regedit.exe"));
		this.listaDeProcessosAceitos.add(new Processo("FoxitReader.exe",
				"C:\\PROGRAM FILES (X86)\\FOXIT SOFTWARE\\FOXIT READER\\FOXITREADER.EXE"));
		this.listaDeProcessosAceitos
				.add(new Processo("DpHostW.exe", "C:\\Program Files (x86)\\DigitalPersona\\Bin\\DpHostW.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("jtagserver.exe", "C:\\intelFPGA_lite\\16.1\\quartus\\bin64\\jtagserver.exe"));
		this.listaDeProcessosAceitos.add(new Processo("LMIGuardianSvc.exe",
				"C:\\Program Files (x86)\\LogMeIn Hamachi\\x64\\LMIGuardianSvc.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("scpbradserv.exe", "C:\\Program Files (x86)\\scpbrad\\scpbradserv.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("hamachi-2.exe", "C:\\Program Files (x86)\\LogMeIn Hamachi\\x64\\hamachi-2.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("scpbradguard.exe", "C:\\Program Files (x86)\\scpbrad\\scpbradguard.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("USBVaccine.exe", "C:\\Program Files (x86)\\Panda USB Vaccine\\USBVaccine.exe"));
		this.listaDeProcessosAceitos.add(new Processo("makecab.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("AM_Delta_Patch_1.255.107.0.exe",
				"C:\\Windows\\SoftwareDistribution\\Download\\Install\\AM_Delta_Patch_1.255.107.0.exe"));
		this.listaDeProcessosAceitos.add(new Processo("mpam-bab5e4d2.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\mpam-bab5e4d2.exe"));
		this.listaDeProcessosAceitos.add(new Processo("MPSigStub.exe",
				"C:\\Windows\\SERVIC~2\\NETWOR~1\\AppData\\Local\\Temp\\{ADBCB322-D63E-4A48-8423-B464D29CC2BF}\\MPSigStub.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.33.7\\GoogleCrashHandler.exe"));
		this.listaDeProcessosAceitos.add(new Processo("GoogleCrashHandler64.exe",
				"C:\\Program Files (x86)\\Google\\Update\\1.3.33.7\\GoogleCrashHandler64.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("javaw.exe", "C:\\Program Files\\Java\\jdk1.8.0_73\\bin\\javaw.exe"));
		this.listaDeProcessosAceitos.add(new Processo("putty.exe", "C:\\Program Files (x86)\\PuTTY\\putty.exe"));
		this.listaDeProcessosAceitos.add(new Processo("userinit.exe", "C:\\Windows\\system32\\userinit.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("hamachi-2-ui.exe", "C:\\Program Files (x86)\\LogMeIn Hamachi\\hamachi-2-ui.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("desfaz_merda.exe", "C:\\arquivos\\jefponte\\Pictures\\desfaz_merda.exe"));
		this.listaDeProcessosAceitos
				.add(new Processo("Compil32.exe", "C:\\Program Files (x86)\\Inno Setup 5\\Compil32.exe"));
		this.listaDeProcessosAceitos.add(new Processo("SearchProtocolHost.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("wsffcmgr.exe", "C:\\Program Files (x86)\\Mozilla Firefox\\wsffcmgr.exe"));
		this.listaDeProcessosAceitos.add(new Processo("scpbradguard.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("setup.exe",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\65.0.3325.146\\Installer\\setup.exe"));
		this.listaDeProcessosAceitos.add(new Processo("attrib.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("FXSSVC.exe", "C:\\Windows\\system32\\fxssvc.exe"));
		this.listaDeProcessosAceitos.add(new Processo("software_reporter_tool.exe",
				"C:\\Users\\dtiusr\\AppData\\Local\\Google\\Chrome\\User Data\\SwReporter\\27.147.200\\software_reporter_tool.exe"));
		this.listaDeProcessosAceitos.add(new Processo("CompatTelRunner.exe", ""));
		this.listaDeProcessosAceitos.add(new Processo("mscorsvw.exe", ""));
		this.listaDeProcessosAceitos
				.add(new Processo("windres.exe", "C:\\Program Files (x86)\\Launch4j\\bin\\windres.exe"));

		this.buscaDeArquivo();

	}

	/**
	 * Busca lista de processos aceitos a partir de um arquivo.
	 */
	public void buscaDeArquivo() {
		File arquivoVerifica = new File("permitidos.txt");
		if (!arquivoVerifica.exists()) {
			FileWriter fw;
			try {
				fw = new FileWriter(arquivoVerifica, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(
						"[Cole aqui os processos do arquivo bloqueados.txt que deseja permitir. Um processo por linha. Não apague esta linha!] ");
				bw.newLine();
				bw.close();
				fw.close();
				return;
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		try {

			FileInputStream arquivo = new FileInputStream(arquivoVerifica);
			BufferedReader linhaArquivo = new BufferedReader(new InputStreamReader(arquivo));
			linhaArquivo.ready();
			while (linhaArquivo.ready()) {
				String linha = linhaArquivo.readLine();
				if (linha.isEmpty()) {
					System.out.println("pulando linha em branco");
					continue;
				}

				if (linha.charAt(0) == '[') {
					continue;
				}

				boolean jaTem = false;
				String[] vDados = linha.split("[,]");

				for (Processo processoAceito : listaDeProcessosAceitos) {
					if (processoAceito.getExecutablePath().equals(vDados[0])
							&& processoAceito.getImagem().equals(vDados[1])) {
						jaTem = true;
						break;
					}
				}

				if (jaTem) {
					System.out.println("já tem -> " + vDados[0]);
					continue;
				}

				try {
					listaDeProcessosAceitos.add(new Processo(vDados[1], vDados[0]));
				} catch (ArrayIndexOutOfBoundsException fora) {
					System.out.println(linha);
				}
			}
			linhaArquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Obter a lista de processos ativos no sistema operacional.
	 */
	public void buscaAtivos() {

		this.processosAtivos = new Vector<Processo>();
		Process process;
		Scanner leitor;

		try {

			process = Runtime.getRuntime().exec(" wmic process  get ProcessID, Name, ExecutablePath /FORMAT:CSV");
			leitor = new Scanner(process.getInputStream());

			while (leitor.hasNext()) {
				String linha = leitor.nextLine();
				if (linha.equals("")) {
					continue;
				}

				String[] vDados = linha.split("[,]");
				this.processosAtivos.add(new Processo(vDados[2], vDados[1], vDados[3]));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Mata os processos ativos que não estiverem na lista dos permitidos. .
	 */
	public void comparaEMata() {

		boolean existeNaLista = false;
		Iterator<Processo> it = processosAtivos.iterator();// usando iterator para evitar erros de acessos simultâneos
		while (it.hasNext()) {
			Processo processoAtivo = it.next();
			existeNaLista = false;

			// Liberando tudo da pasta do autocad.

			if (processoAtivo.getExecutablePath().length() > 38) {
				if (processoAtivo.getExecutablePath().substring(0, 38)
						.equals("C:\\Program Files\\Autodesk\\AutoCAD 2016")) {
					existeNaLista = true;
					continue;
				}

				if (processoAtivo.getExecutablePath().substring(0, 21).equals("C:\\Program Files\\Java")) {
					existeNaLista = true;
					continue;
				}
				if (processoAtivo.getExecutablePath().substring(0, 27).equals("C:\\Program Files (x86)\\Java")) {
					existeNaLista = true;
					continue;
				}
				if (processoAtivo.getExecutablePath().substring(0, 16).equals("C:\\PROGRA~1\\Java")) {
					existeNaLista = true;
					continue;
				}
			}

			for (Processo processoAceito : this.listaDeProcessosAceitos) {

				if (processoAtivo.equals(processoAceito)) {
					existeNaLista = true;
					break;

				}
			}
			if (!existeNaLista) {

				try {
					Runtime.getRuntime().exec(" taskkill /PID \"" + processoAtivo.getProcessId() + "\" /F");

					if (!this.existeNaLista(processoAtivo, this.listaDeBloqueados)) {
						this.listaDeBloqueados.add(processoAtivo);

					}
					new Log(processoAtivo.getExecutablePath() + "," + processoAtivo.getImagem(), "bloqueados.txt");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

	/**
	 * Exibe os processos ativos.
	 */
	public void mostraProcessos() {
		for (Processo p : this.processosAtivos) {
			System.out.println(p);
		}
	}

	public void mostraBloqueados() {
		for (Processo p : this.listaDeBloqueados) {
			System.out.println(p);
		}
	}

	/**
	 * @param processo
	 * @param lista
	 * @return
	 */
	public boolean existeNaLista(Processo processo, Collection<Processo> lista) {
		for (Processo processo2 : lista) {
			if (processo.getExecutablePath().toLowerCase().trim()
					.equals(processo2.getExecutablePath().toLowerCase().trim())
					&& processo.getImagem().toLowerCase().trim().equals(processo2.getImagem().toLowerCase().trim())) {
				return true;
			}
		}
		return false;
	}
}
