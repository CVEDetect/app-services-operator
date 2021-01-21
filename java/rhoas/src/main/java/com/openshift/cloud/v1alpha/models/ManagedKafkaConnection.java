
package com.openshift.cloud.v1alpha.models;

import java.util.HashMap;
import java.util.Map;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Plural;
import io.fabric8.kubernetes.model.annotation.Version;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Plural("managedkafkaconnections")
@Group("rhoas.redhat.com")
@Version("v1alpha1")
public class ManagedKafkaConnection extends CustomResource<ManagedKafkaConnectionSpec, ManagedKafkaConnectionStatus> {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("managedKafkaConnectionSpec", getSpec()).append("managedKafkaConnectionStatus", getStatus()).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(getSpec()).append(getStatus()).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagedKafkaConnection) == false) {
            return false;
        }
        ManagedKafkaConnection rhs = ((ManagedKafkaConnection) other);
        return new EqualsBuilder().append(getSpec(), rhs.getSpec()).append(getStatus(), rhs.getStatus()).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
