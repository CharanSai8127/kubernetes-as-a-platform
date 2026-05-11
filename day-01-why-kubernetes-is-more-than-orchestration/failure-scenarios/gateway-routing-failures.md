# Gateway Routing Failures

Gateway API controls how traffic enters and moves through Kubernetes platforms.

Improper routing configuration can prevent requests from reaching workloads.

---

# Common Causes

## Incorrect Backend References

HTTPRoute resources may reference:
- invalid Services
- incorrect ports
- missing backends

Result:
Traffic routing fails before reaching workloads.

---

## Hostname Mismatches

Gateway listeners and HTTPRoutes may contain mismatched hostnames.

Result:
Requests become rejected or unrouted.

---

## TLS Misconfiguration

TLS certificates may:
- not match hostnames
- fail validation
- expire unexpectedly

Result:
Secure traffic fails before application delivery.

---

# Debugging Commands

```bash
kubectl get gateway
kubectl get httproute
kubectl describe gateway
kubectl describe httproute
