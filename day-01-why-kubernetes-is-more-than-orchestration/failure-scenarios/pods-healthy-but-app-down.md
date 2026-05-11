# Pods Healthy but Users Cannot Access the Application

Healthy Pods do not guarantee a healthy application.

In Kubernetes, requests pass through multiple operational layers before reaching workloads, and failures can occur at any stage of the request path.

---

# Common Failure Layers

## DNS Resolution Issues

External DNS records may:
- point to stale IP addresses
- contain incorrect load balancer targets
- fail propagation

Result:
Users cannot reach the platform entry point.

---

## Gateway or Ingress Misconfiguration

Traffic admission into the platform may fail because of:
- invalid Gateway listeners
- incorrect HTTPRoute configuration
- hostname mismatches
- TLS configuration failures

Result:
Traffic enters the platform incorrectly or gets rejected before reaching workloads.

---

## Service Discovery Failures

Services may fail to route traffic because of:
- selector mismatches
- incorrect ports
- missing endpoints

Example:

```bash
kubectl get svc
kubectl get endpoints
