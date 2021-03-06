package ninja.codingsolutions.solaredgeapiclient.models.impl;

import ninja.codingsolutions.solaredgeapiclient.interfaces.DeepCopyable;

import java.util.List;

public class SupportedVersionsResponseImplTest extends BaseModelTest {
    @Override
    protected DeepCopyable buildRandomObject() {
        return SupportedVersionsResponseImpl.builder().supported(List.of(VersionImpl.builder()
                .release(Integer.toString(random.nextInt()))
                .build()))
            .build();
    }

    @Override
    protected Class<?> getDeserializiableClass() {
        return SupportedVersionsResponseImpl.class;
    }
}
