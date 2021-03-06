package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentLoaderOperations.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */
public interface ComponentLoaderOperations {

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle load(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id,
            String[] args) throws ComponentNotFound,
            ComponentAlreadyLoaded,
            LoadFailure;

    void unload(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle handle)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotFound;

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle[] getLoadedComponents();

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId[] getInstalledComponents();
} // interface ComponentLoaderOperations
