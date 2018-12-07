package com.noto.taskoperator;

import Classes.DefiningClassesService;
import org.jboss.resteasy.plugins.server.netty.NettyJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

import java.util.ArrayList;
import java.util.List;

class TaskOperator {
	public static NettyJaxrsServer netty;

	private static void start(ResteasyDeployment deployment) throws Exception {
		netty = new NettyJaxrsServer();
		netty.setDeployment(deployment);
		netty.setPort(9898);
		netty.setRootResourcePath("");
		netty.setSecurityDomain(null);
		netty.start();
	}

	private static List<Class<?>> getResourceClazzes() {
		List<Class<?>> resourceClasses = new ArrayList<>();
		resourceClasses.add(TestServiceImpl.class);
		resourceClasses.add(DefiningClassesService.class);
		return resourceClasses;
	}

	private static List<String> getResourceClasses() {
		List<String> resourceClasses = new ArrayList<>();
		for (Class<?> clazz : getResourceClazzes()) {
			resourceClasses.add(clazz.getName());
		}
		return resourceClasses;
	}

	private static List<String> getProviderClasses() {
		List<String> providerClasses = new ArrayList<String>();
		return providerClasses;
	}


	public static void main(String[] args) {
		ResteasyDeployment red = new ResteasyDeployment();
		red.setResourceClasses(getResourceClasses());

		red.setProviderClasses(getProviderClasses());
		try {
			start(red);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
