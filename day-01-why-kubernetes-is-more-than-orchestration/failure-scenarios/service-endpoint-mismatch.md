# Service Endpoint Mismatch

Kubernetes Services route traffic to Pods through label selectors.

If labels do not match correctly, the Service will not register endpoints.

---

# Example

## Service Selector

```yaml
selector:
  app: frontend
