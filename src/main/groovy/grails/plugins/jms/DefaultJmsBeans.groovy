package grails.plugins.jms

import org.springframework.jms.listener.DefaultMessageListenerContainer

converters {
    standard {}
}
templates {
    standard {
        connectionFactoryBean = "jmsConnectionFactory"
        messageConverterBean = "standardJmsMessageConverter"
    }
}
containers {
    standard {
        concurrentConsumers = 1
        subscriptionDurable = false
        autoStartup = false
        connectionFactoryBean = "jmsConnectionFactory"
        messageSelector = null
        cacheLevel = DefaultMessageListenerContainer.CACHE_CONSUMER
    }
}
adapters {
    standard {
        messageConverterBean = "standardJmsMessageConverter"
        persistenceInterceptorBean = 'persistenceInterceptor'
    }
}